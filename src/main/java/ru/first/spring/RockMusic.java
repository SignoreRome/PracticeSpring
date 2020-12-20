package ru.first.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> songList = Arrays.asList("Bohemian Rhapsody", "Wind of Change", "Highway to Hell");
    private Random random = new Random();


    @Override
    public String getSong() {
        return songList.get(random.nextInt(3));
    }
}
