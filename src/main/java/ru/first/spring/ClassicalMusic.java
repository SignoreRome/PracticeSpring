package ru.first.spring;


import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music{
    private ClassicalMusic(){
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("doing initilization");
    }

    public void doMyDestroy(){
        System.out.println("destroy bean");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
