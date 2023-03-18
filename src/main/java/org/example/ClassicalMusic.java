package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

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
