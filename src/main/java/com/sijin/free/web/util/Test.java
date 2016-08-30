package com.sijin.free.web.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sijinzhang on 16/8/29.
 */
public class Test {

    public static void main(String[] args) {
       List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        System.out.println(list.subList(list.size()-2,list.size()));

    }
}
