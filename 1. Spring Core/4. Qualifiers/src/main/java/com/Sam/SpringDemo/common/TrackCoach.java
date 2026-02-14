package com.Sam.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Track coach";
    }
}
