package ru.first.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;
    @Autowired
    @Qualifier("rapMusic")
    private Music rapMusic;

    public void playMusic(Genre genre) {
        switch (genre){
            case RAP:
                System.out.println(rapMusic.getSong());
                break;
            case ROCK:
                System.out.println(rockMusic.getSong());
                break;
            default:
                System.out.println("No");
        }

    }


//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
