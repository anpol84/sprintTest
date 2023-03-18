package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> list;

    public MusicPlayer(List<Music> music) {
        list = music;
    }

    public String playMusic(){
        Random random = new Random();
        int ch1 = random.nextInt(3);
        int ch2 = random.nextInt(3);
        return list.get(ch1).getSong().get(ch2);
    }
}
