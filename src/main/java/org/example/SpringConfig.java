package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;


@Configuration

@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> listBean(){
        ArrayList<Music> list = new ArrayList<>();
        list.add(rapMusic());
        list.add(classicalMusic());
        list.add(rockMusic());
        return list;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listBean());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
