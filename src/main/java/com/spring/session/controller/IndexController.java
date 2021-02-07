package com.spring.session.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by DELL(mxd) on 2021/2/7 18:08
 */

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/show")
    public String show(HttpServletRequest request){
        return "I'm " + request.getLocalPort();
    }


    @RequestMapping(value = "/session")
    public String getSession(HttpServletRequest request) {
        request.getSession().setAttribute("userName", "admin");
        return "I'm " + request.getLocalPort() + " save session " + request.getSession().getId();
    }

    @RequestMapping(value = "/get")
    public String get(HttpServletRequest request) {
        String userName = (String) request.getSession().getAttribute("userName");
        return "I'm " + request.getLocalPort() + " -----userName :" + userName + "-----port:" + port;
    }

}
