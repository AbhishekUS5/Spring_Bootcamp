package com.Sam.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkOut() {
        return "Lets play baseball for 20 minutes";
    }
}
