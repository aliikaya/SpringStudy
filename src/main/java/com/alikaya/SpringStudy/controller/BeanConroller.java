package com.alikaya.SpringStudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alikaya.SpringStudy.bean.BeanConfig;

@Controller
public class BeanConroller {
    
    @Autowired
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") // url
    @ResponseBody // html olmadan ekranda göster
    public String getBeanDto(){
        return beanConfig.beanDto() + "";
    }
}
