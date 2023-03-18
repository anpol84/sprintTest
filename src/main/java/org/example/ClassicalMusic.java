package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    ArrayList<String> list = new ArrayList<>();
    public ClassicalMusic(){
        list.add("Classical Music 1");
        list.add("Classical Music 2");
        list.add("Classical Music 3");
    }

    public ArrayList<String> getList() {
        return list;
    }


    @Override
    public List<String> getSong() {
        return list;
    }
}
