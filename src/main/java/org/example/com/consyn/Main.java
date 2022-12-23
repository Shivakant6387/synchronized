package org.example.com.consyn;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thread>threads=new ArrayList<>();
        for (int i=0;i<500;i++){
            Runnable task=new MyRunnable(10000000L+i);
            Thread worker=new Thread(task);
            worker.setName(String.valueOf(i));
            worker.start();
        }
        int running=0;
        do{
            running=0;
            for (Thread thread:threads){
                if (thread.isAlive()){
                    running++;
                }
            }
            System.out.println("We have "+running+"running threads");
        }while (running>0);
    }
}
