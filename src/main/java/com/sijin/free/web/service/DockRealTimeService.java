package com.sijin.free.web.service;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.Codes;
import com.sijin.free.web.common.domain.DockRealTime;
import com.sijin.free.web.mappers.CodesMapper;
import com.sijin.free.web.util.CovertUtil;
import com.sijin.free.web.util.HttpClientPoolUtill;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class DockRealTimeService {
    @Resource
    private CodesMapper codesMapper;
    private static  String url ="http://hq.sinajs.cn/list=";
    static HttpClientPoolUtill httpClient = new HttpClientPoolUtill(1,2);

    public List<DockRealTime> realtime(BaseRequest baseRequest) {
        int level =2;
        List<Codes> codesList = codesMapper.selectByLevel(level);

        StringBuffer sb = new StringBuffer();
        for(Codes dockInfo : codesList){
            sb.append(dockInfo.getCode()).append(",");
        }
        String posturl = url+ sb.deleteCharAt(sb.length()-1).toString();
        String result = "";
        try{
            result = httpClient.get(posturl);
        } catch (Exception e){
            e.printStackTrace();
        }
        String arrp[] = result.split(";\n");
        List<DockRealTime> list  = new ArrayList<>();
        for(String r : arrp){
            DockRealTime inf = CovertUtil.covertToDockRealTime(r);
            list.add(inf);
        }
        return list;
    }


    public int countRealtime(BaseRequest baseRequest) {
        int level =2;
        return  codesMapper.countSelectByLevel(level);
    }
}
