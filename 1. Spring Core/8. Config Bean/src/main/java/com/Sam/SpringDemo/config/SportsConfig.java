package com.Sam.SpringDemo.config;

import com.Sam.SpringDemo.common.Coach;
import com.Sam.SpringDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
