package com.sijin.free.web.util;


import com.sijin.free.web.common.domain.DockInfo;
import com.sijin.free.web.common.domain.DockRealTime;

/**
 * Created by sijinzhang on 16/5/6.
 */
public class CovertUtil {


    /**
     * covert
     * @param input
     * @return
     */
    public static DockInfo covertToDockInfo(String input){

        String[] arr = input.split("\"");
        String str = arr[1];
        String[] strArrDockinfo = str.split(",");
        DockInfo dockInfo = new DockInfo();
        dockInfo.setName(strArrDockinfo[0]);
        String s = arr[0].split("str_")[1];
        dockInfo.setCode(s.substring(0,s.length()-1));

        return  dockInfo;
    }

    public static DockRealTime covertToDockRealTime(String input){
        String[] arr = input.split("\"");
        String str = arr[1];
        String[] strArrDockinfo = str.split(",");
        DockRealTime dockInfo = new DockRealTime();
        dockInfo.setName(strArrDockinfo[0]);
        dockInfo.setsPrice(Double.valueOf(strArrDockinfo[1]));
        dockInfo.setYesterdayprice(Double.valueOf(strArrDockinfo[2]));
        dockInfo.setPrice(Double.valueOf(strArrDockinfo[3]));
        dockInfo.sethPrice(Double.valueOf(strArrDockinfo[4]));
        dockInfo.setlPrice(Double.valueOf(strArrDockinfo[5]));
        dockInfo.setTime(strArrDockinfo[30] + " " + strArrDockinfo[31]);
        String s = arr[0].split("str_")[1];
        dockInfo.setCode(s.substring(0,s.length()-1));
        return  dockInfo;
    }

}
