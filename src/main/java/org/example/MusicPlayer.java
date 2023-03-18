package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType musicType){
        Random random = new Random();
        int ch = random.nextInt(3);
        if (musicType == MusicType.CLASSICAL_MUSIC){
            return music1.getSong().get(ch);
        }else if (musicType == MusicType.ROCK_MUSIC){
            return music2.getSong().get(ch);
        }else return null;
    }
}
