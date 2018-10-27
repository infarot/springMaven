package com.dawidspring.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService {

    private List<String> fortuneList;
    private Random random;

    RandomFortune(){
        random = new Random();
        fortuneList = new ArrayList<>();
        fortuneList.add("mes1");
        fortuneList.add("mes2");
        fortuneList.add("mes3");
        fortuneList.add("mes4");
        fortuneList.add("abc");
    }


    @Override
    public String getFortune() {
        return fortuneList.get(random.nextInt(4));
    }
}
