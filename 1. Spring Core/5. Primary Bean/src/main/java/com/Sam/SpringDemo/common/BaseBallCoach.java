package com.Sam.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Lets play baseball for 20 minutes";
    }
}
