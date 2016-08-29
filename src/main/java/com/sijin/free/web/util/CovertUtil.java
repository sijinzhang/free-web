package com.sijin.free.web.util;


import com.sijin.free.web.common.domain.DockInfo;

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

    public static String covertCode(String input){
        String code = "";
        if(input.startsWith("0") || input.startsWith("3")){
            return  "sz" + input;
        }
        if(input.startsWith("6")){
            return  "sh" + input;
        }
        return code;

    }
}
