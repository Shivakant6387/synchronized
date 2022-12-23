package org.example.com.consyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        try{
            List<String>list=new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            System.out.println("list"+list);
            List<String>stringList= Collections.synchronizedList(list);
            System.out.println("synchronizedList  is"+stringList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
