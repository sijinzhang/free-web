package com.sijin.free.web.init;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sijin.free.web.common.domain.*;
import com.sijin.free.web.common.domain.yahoo.YahooDock;
import com.sijin.free.web.mappers.*;
import com.sijin.free.web.util.CovertUtil;
import com.sijin.free.web.util.HttpClientPoolUtill;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by sijinzhang on 16/8/28.
 */
public class DataInit {

    static HttpClientPoolUtill httpClient = new HttpClientPoolUtill(1,2);
    static String url_all = "http://ctxalgo.com/api/stocks";

    protected static  ConfigurableApplicationContext context;
    static  CodesMapper codesMapper;
    static  DockInfoMapper dockInfoMapper;
    static  DockHistoryMapper dockHistoryMapper;
    static DockmaMapper dockmaMapper;
    static RedSoldierMapper redSoldierMapper;

    public static void main(String[] args) {
        try {
            context = new ClassPathXmlApplicationContext("spring/spring-context.xml");
            codesMapper = context.getBean("codesMapper", CodesMapper.class);
            dockInfoMapper = context.getBean("dockInfoMapper", DockInfoMapper.class);
            dockHistoryMapper = context.getBean("dockHistoryMapper", DockHistoryMapper.class);
            dockmaMapper = context.getBean("dockmaMapper", DockmaMapper.class);
            redSoldierMapper = context.getBean("redSoldierMapper", RedSoldierMapper.class);


            //initCodes();
            //updatename(list);
            int followLevel =1;
            List<Codes> list = codesMapper.selectByLevel(followLevel);
            //initLevel(list);
            //initDockInfo();
            initCodesPrice(list);
            System.out.println("结束。。。");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private static void initDockInfo() throws Exception{
        String str = null;
        BufferedReader br = new BufferedReader(new FileReader("/Users/sijinzhang/git/datapp/free-web/src/main/resources/conf.properties"));
        while((str = br.readLine()) != null) {
            if(str.startsWith("#")|| StringUtils.isEmpty(str)){
                continue;
            }
            DockInfo dockInfo  = new DockInfo();
            String[] p = str.split(",");
            dockInfo.setCode(p[0]);
            dockInfo.setMywantbuy(Double.valueOf(p[1]));
            dockInfo.setMywantsale(Double.valueOf(p[2]));
            dockInfo.setName(p[3]);
            dockInfo.setCreated(System.currentTimeMillis());
            dockInfo.setUpdated(System.currentTimeMillis());
            dockInfoMapper.insertSelective(dockInfo);

        }
    }

    private static void initLevel(List<Codes> list) throws Exception{
        Map<String,Codes> map = new HashMap<>();
        for(Codes dockInfo : list){
            map.put(dockInfo.getCode(),dockInfo);
        }
        String str = null;
        BufferedReader br = new BufferedReader(new FileReader("/Users/sijinzhang/git/datapp/free-web/src/main/resources/conf.properties"));
        while((str = br.readLine()) != null) {
            if(str.startsWith("#")|| StringUtils.isEmpty(str)){
                continue;
            }
            String[] p = str.split(",");
            Codes c = new Codes();
            c.setFollowLevel(2);
            if(map.get(p[0]) == null){
                System.out.println("------------"+ p[0]);
                continue;
            }
            c.setId(map.get(p[0]).getId());
            System.out.println(c.toString());
            codesMapper.updateByPrimaryKeySelective(c);

        }
    }

    private static void updatename(List<Codes> list) throws Exception{
        StringBuffer sb = new StringBuffer();
        Map<String,Codes> map = new HashMap<>();
        for(Codes dockInfo : list){
            sb.append(dockInfo.getCode()).append(",");
            map.put(dockInfo.getCode(),dockInfo);
        }

        String url ="http://hq.sinajs.cn/list=";
        String posturl = url+ sb.deleteCharAt(sb.length()-1).toString();
        String result = httpClient.get(posturl);
        String arrp[] = result.split(";\n");
        for(String r : arrp){
            DockInfo inf = CovertUtil.covertToDockInfo(r);
            if(!map.get(inf.getCode()).getName().equals(inf.getName())){
                Codes codes = new Codes();
                codes.setId(map.get(inf.getCode()).getId());
                codes.setName(inf.getName());
                System.out.println(codes.toString() +"||||oldname==>" + map.get(inf.getCode()).getName());
                codesMapper.updateByPrimaryKeySelective(codes);
            }
        }
    }

    private static void initCodesPrice(List<Codes> list) throws Exception{

        Map<String,Codes> map = new HashMap<>();
        for(Codes dockInfo : list){
            map.put(dockInfo.getCode(),dockInfo);
        }
        DecimalFormat df = new DecimalFormat("######0.00");
        String str = null;
        BufferedReader br = new BufferedReader(new FileReader("/Users/sijinzhang/git/datapp/free-web/src/main/resources/conf.properties"));
        while((str = br.readLine()) != null) {
            if(str.startsWith("#")|| StringUtils.isEmpty(str)){
                continue;
            }
            String[] p = str.split(",");
            System.out.println("正在处理：" + p[0]);
            DockHistory history = new DockHistory();
            history.setCode(p[0]);
            history.setCode(history.getCode());
//            List<DockHistory> dockHistoryList = dockHistoryMapper.selectByDockHistory(history);
//            if(!CollectionUtils.isEmpty(dockHistoryList)){
//                System.out.println("数据库已经存在" + p[0]);
//                continue;
//            }
            String sockCode = p[0].substring(2, p[0].length()).concat(".").concat(p[0].substring(0, 2));
            sockCode = sockCode.replaceAll("sh", "SS");
            String url = "https://query2.finance.yahoo.com/v8/finance/chart/{0}?formatted=true&crumb=s8TWg1rzwZX&lang=en-US&region=US&interval=1d&events=div%7Csplit&range=3mo&corsDomain=finance.yahoo.com";
            String _url = MessageFormat.format(url, sockCode);
            System.out.println(_url);
            String result = "";
            for(int i=0;i<10; i++){
                try {
                    result = httpClient.get(_url,"utf-8", 5000, 3000);
                    break;
                }catch (Exception e){
                    System.out.println("请求失败，睡眠后重试 ＋" +sockCode);
                    Thread.sleep(3000);
                    continue;
                }

            }
            JSONObject chat = (JSONObject) JSON.parseObject(result).get("chart");
            JSONArray jsonArray = (JSONArray) chat.get("result");
            if(jsonArray.size() == 0){
                System.out.println("发生错误00"+sockCode);
                continue;}
            YahooDock yahooDock = JSON.parseObject(jsonArray.get(0).toString(), YahooDock.class);
            List<Long> timeList = yahooDock.getTimestamp();
            if(timeList.size()<30){continue;}
            List<Double> pclose = yahooDock.getIndicators().getQuote().get(0).getClose();
            List<Double> popen = yahooDock.getIndicators().getQuote().get(0).getOpen();
            List<Double> plowlist = yahooDock.getIndicators().getQuote().get(0).getLow();
            List<Double> phighlist = yahooDock.getIndicators().getQuote().get(0).getHigh();
            List<Double> pvolume = yahooDock.getIndicators().getQuote().get(0).getVolume();

            plowlist = plowlist.subList(plowlist.size()-30,plowlist.size());
            phighlist = phighlist.subList(phighlist.size()-30,phighlist.size());
            pclose = pclose.subList(pclose.size()-30,pclose.size());
            try{
                //红三兵
                double price=0d,price1=0d,price2=0d,price3=0d;
                price = pclose.get(pclose.size()-1);
                price3 = pclose.get(pclose.size()-2);
                price2 = pclose.get(pclose.size()-3);
                price1 = pclose.get(pclose.size()-4);
                if((price >= price3 && price3 >= price2) || (price<price3 && price3 >= price2 && price2 >= price1 )){
                    RedSoldier redSoldier = new RedSoldier();
                    redSoldier.setCode(p[0]);
                    redSoldier.setName(p[3]);
                    redSoldier.setPrice(price);
                    redSoldier.setPrice1(price1);
                    redSoldier.setPrice2(price2);
                    redSoldier.setPrice3(price3);
                    redSoldier.setcreated(System.currentTimeMillis());
                    redSoldier.setUpdated(System.currentTimeMillis());
                    redSoldierMapper.insertSelective(redSoldier);
                }


                //均价
//                double sum5=0D,sum10=0D,sum20=0D,sum30=0D;
//                for(int i=0;i<pclose.size(); i++ ){
//                    if(i<5){
//                        sum5+=pclose.get(i);
//                    }
//                    if(i<10){
//                        sum10+=pclose.get(i);
//                    }
//                    if(i<20){
//                        sum20+=pclose.get(i);
//                    }
//                    if(i<30){
//                        sum30+=pclose.get(i);
//                    }
//                }
//                double price = pclose.get(pclose.size()-1);
//
//                Collections.sort(phighlist);
//                Collections.sort(plowlist);
//
//                Dockma dockma = new Dockma();
//                dockma.setCodes(p[0]);
//                dockma.setName(p[3]);
//                dockma.setMa5(sum5 / 5);
//                dockma.setMa10(sum10 / 10);
//                dockma.setMa20(sum20 / 20);
//                dockma.setMa30(sum30 / 30);
//                dockma.setPrice(price);
//                dockma.setlowPrice(plowlist.get(0));
//                dockma.sethighPrice(phighlist.get(phighlist.size() - 1));
//                dockma.setDeviation((price - dockma.getlowPrice()) / price);
//                dockma.setUpdated(System.currentTimeMillis());
//                dockma.setCreated(System.currentTimeMillis());
//                dockmaMapper.insertSelective(dockma);




                 //历史
//                for(int i=0;i<timeList.size();i++){
//                    DockHistory dockHistory = new DockHistory();
//                    dockHistory.setCode(p[0]);
//                    dockHistory.setName(map.get(p[0]).getName());
//                    dockHistory.setClose(new Double(df.format(pclose.get(i))));
//                    dockHistory.setOpen(new Double(df.format(popen.get(i))));
//                    dockHistory.setHigh(new Double(df.format(phighlist.get(i))));
//                    dockHistory.setLow(new Double(df.format(plowlist.get(i))));
//                    dockHistory.setVolume(new Double(df.format(pvolume.get(i))));
//                    Long t = timeList.get(i);
//                    Date d = new Date(t*1000);
//                    dockHistory.setDate(d);
//                    dockHistory.setCreated(d.getTime()*1000);
//                    dockHistory.setUpdated(d.getTime()*1000);
//                    dockHistory.setVolume(new Double(df.format(pvolume.get(i))));
//                    dockHistoryMapper.insertSelective(dockHistory);
//                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("error ------+ " + sockCode);
            }

        }

    }

    public static void initCodes() throws Exception{
        String[] strstock;
        String dock_result = httpClient.get(url_all, "gbk", 250000, 30000);
        if(StringUtils.isNotBlank(dock_result)){
            String ss = dock_result.substring(dock_result.indexOf("{") + 1, dock_result.indexOf("}"));
            String[] arr = ss.split(",");
            int length = arr.length;
            for(int i=0;i<length; i++){
                Codes dockInfo = new Codes();
                strstock = arr[i].split(":");
                if(strstock.length >=2){

                    dockInfo.setCode(strstock[0].replaceAll("\"","").trim());
                    dockInfo.setName(convert(strstock[1].replaceAll("\"", "")));
                    dockInfo.setCreated(System.currentTimeMillis());
                    dockInfo.setUpdated(System.currentTimeMillis());;
                    dockInfo.setFollowLevel(0);
                    System.out.println("正在处理[" + i + "]-->" + dockInfo.getCode());
                    codesMapper.insertSelective(dockInfo);
                }
            }
        }

    }

    public static String convert(String utfString){
        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;
        while((i=utfString.indexOf("\\u", pos)) != -1){
            sb.append(utfString.substring(pos, i));
            if(i+5 < utfString.length()){
                pos = i+6;
                sb.append((char)Integer.parseInt(utfString.substring(i+2, i+6), 16));
            }
        }
        return sb.toString().trim();
    }
}
