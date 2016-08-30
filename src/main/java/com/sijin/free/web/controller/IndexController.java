package com.sijin.free.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author tuijiang
 * Date 16/4/13
 */

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = "index")
    public String welcome() {
        return "dailyreback";

    }

    @RequestMapping(value = "optional")
    public String optional() {
        return "optional";
    }

    @RequestMapping(value = "dailyreback")
    public String dailyreback() {
        return "dailyreback";
    }

    @RequestMapping(value = "realtime")
    public String realtime() {
        return "realtime";
    }

    @RequestMapping(value = "redSoldier")
    public String redSoldier() {
        return "redSoldier";
    }

}
