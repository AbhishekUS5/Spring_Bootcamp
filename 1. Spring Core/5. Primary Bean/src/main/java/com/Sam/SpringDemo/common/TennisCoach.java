package com.Sam.SpringDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Tennins king";
    }
}
