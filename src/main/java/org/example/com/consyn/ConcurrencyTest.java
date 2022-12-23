package org.example.com.consyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest {
  static final List a = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> addIfAbsent(17));
        thread.start();
       addIfAbsent(18);
        thread.join();
        System.out.println(a);
    }

    private /*synchronized*/ static void addIfAbsent(int i) {
        synchronized (a) {
            if (!a.contains(i)) {
                a.add(i);
            }
        }
    }
}