package ru.first.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);

//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(3));
//        }

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(Genre.ROCK);
        musicPlayer.playMusic(Genre.RAP);


        context.close();
    }
}
