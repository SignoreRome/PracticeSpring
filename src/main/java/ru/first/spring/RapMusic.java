package ru.first.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
public class RapMusic implements Music{
    private List<String> songList = Arrays.asList("Slim shady", "Fuck the police", "Without Me");
    private Random random = new Random();


    @Override
    public String getSong() {
        return songList.get(random.nextInt(3));
    }
}
