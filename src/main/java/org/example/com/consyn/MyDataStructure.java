package org.example.com.consyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDataStructure {
    List<String>list=new ArrayList<>();
    public void add(String s){
        list.add(s);
    }
    public List<String>getList(){
        return Collections.unmodifiableList(list);
    }
}