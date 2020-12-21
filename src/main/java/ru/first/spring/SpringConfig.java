package ru.first.spring;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.first.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public HipHopMusic hipHopMusic(){
        return new HipHopMusic();
    }

    @Bean
    public Jazz jazz(){
        return new Jazz();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList(){
        return new ArrayList<>(Arrays.asList(jazz(),hipHopMusic(),classicalMusic()));
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
