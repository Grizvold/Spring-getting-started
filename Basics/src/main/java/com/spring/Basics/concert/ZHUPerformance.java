package com.spring.Basics.concert;

import org.springframework.stereotype.Component;

@Component("zhuPerformance")
public class ZHUPerformance implements Performance{
    private String artist = "ZHU";

    @Override
    public void perform() {
        System.out.println(artist + " is now performing");
    }
}
