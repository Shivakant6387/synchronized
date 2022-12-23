package org.example.com.consyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("World");
        list= Collections.synchronizedList(list);
        synchronized (list){
            Iterator iterator=list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next()+" ");
            }
        }
    }
}
