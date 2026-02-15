package com.Sam.SpringDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }

    // Define our init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartupStuff():" + getClass().getSimpleName());
    }
}
