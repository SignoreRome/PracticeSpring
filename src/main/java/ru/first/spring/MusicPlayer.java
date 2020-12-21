package ru.first.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private  String name;
    @Value("${musicPlayer.volume}")
    private int volume;
//    @Autowired
//    @Qualifier("rockMusic")
    private Music rockMusic;
//    @Autowired
//    @Qualifier("rapMusic")
    private Music rapMusic;
//    private Music music;

    private List<Music> musicList;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

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

    public String playMusic(){
        Random random = new Random();

        return "Playing " + musicList.get(random.nextInt(3)).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    public void setMusic(Music music) {
//        this.music = music;
//    }
}
