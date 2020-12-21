package ru.first.spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ClassicalMusic implements Music{
    ClassicalMusic(){
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("doing initilization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy bean");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
