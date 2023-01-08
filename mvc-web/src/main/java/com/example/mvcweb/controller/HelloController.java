package com.example.mvcweb.controller;

import com.example.mvcweb.enumer.BaseResponseEnum;
import com.example.mvcweb.form.MvcWebResponse;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {


    @GetMapping(path = "/hello")
    public MvcWebResponse hello(){
        return MvcWebResponse.success(null);
    }

    @GetMapping(path = "/error")
    public MvcWebResponse error(){
        return MvcWebResponse.error();
    }
}
