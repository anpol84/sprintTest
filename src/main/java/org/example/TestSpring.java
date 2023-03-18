package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
       // musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println(computer.getMusicPlayer().getName());
        System.out.println(computer.getMusicPlayer().getVolume());

        //ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        //System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
    }
}
