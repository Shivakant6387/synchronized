package org.example.com.consyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Exception{
        try {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(20);
            integerList.add(30);
            integerList.add(40);
            integerList.add(50);
            integerList.add(60);
            System.out.println("list" + integerList);
            List<Integer> list = Collections.synchronizedList(integerList);
            System.out.println("SynchronizedList is"+list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
