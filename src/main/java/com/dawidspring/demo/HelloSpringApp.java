package com.dawidspring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
    }
}
