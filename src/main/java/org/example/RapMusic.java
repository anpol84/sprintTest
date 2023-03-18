package org.example;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{
    ArrayList<String> list = new ArrayList<>();
    public RapMusic(){
        list.add("Rap Music 1");
        list.add("Rap Music 2");
        list.add("Rap Music 3");
    }
    @Override
    public List<String> getSong() {
        return list;
    }
}
