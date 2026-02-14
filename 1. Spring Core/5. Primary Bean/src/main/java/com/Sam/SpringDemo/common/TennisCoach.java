package com.Sam.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Tennins king";
    }
}
