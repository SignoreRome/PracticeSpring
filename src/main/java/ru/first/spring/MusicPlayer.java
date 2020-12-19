package ru.first.spring;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private int value;

    public void playMusic() {
        for (Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
