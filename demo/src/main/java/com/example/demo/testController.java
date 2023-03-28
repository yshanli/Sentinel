package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(value = "test")
public class testController {
    @Value("#{'${whiteList}'.split(',')}")
    private List<String> whiteList;

    @PostConstruct
    public void init() {
        if (whiteList.contains("123445")) {
        }

    }

    @GetMapping(value = "/1")
    public String test1() {
        return "Hello,Sentinel --> 1";
    }

    @GetMapping(value = "/2")
    public String test2() {
        return "Hello,Sentinel --> 2";
    }
}
