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
        return "verdict";

    }

    @RequestMapping(value = "verdict")
    public String verdict() {
        return "verdict";
    }

    @RequestMapping(value = "audit")
    public String audit() {
        return "audit";
    }

    @RequestMapping(value = "media")
    public String media() {
        return "media";
    }

    @RequestMapping(value = "editor")
    public String editor() {
        return "editor";
    }

    @RequestMapping(value="status")
    @ResponseBody
    public String status() {
        return "SUCCESS";
    }
}
