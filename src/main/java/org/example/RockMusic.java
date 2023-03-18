package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    ArrayList<String> list = new ArrayList<>();
    public RockMusic(){
        list.add("Rock Music 1");
        list.add("Rock Music 2");
        list.add("Rock Music 3");
    }

    public ArrayList<String> getList() {
        return list;
    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
