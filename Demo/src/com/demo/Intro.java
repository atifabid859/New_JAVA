package com.demo;

import java.util.ArrayList;
import java.util.List;

public interface Intro {
    List<Integer> list = new ArrayList<>(); // public static final by default
}

class MyClass1 implements Intro {

    void m1() {
        list.add(1);
        list.add(2);
    }
}

class MyClass2 implements Intro {
	
    void m1() {
        list.add(3);
        list.add(4);
    }

    public static void main(String[] args) {
    	List<Integer> list1 = new ArrayList<>();
        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();

        myClass1.m1();
        myClass2.m1();
        list1.addAll(list);
        System.out.println(list1);

        System.out.println(Intro.list);
    }
}
