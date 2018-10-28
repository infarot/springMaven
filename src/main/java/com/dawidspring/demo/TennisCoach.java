package com.dawidspring.demo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice backhand";
    }
}
