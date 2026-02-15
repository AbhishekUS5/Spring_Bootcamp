package com.Sam.SpringDemo.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 1000 mtr as a warmup";
    }
}
