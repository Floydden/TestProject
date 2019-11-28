package com.example.testproject;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

class Dog {
    int age; // возраст
    String name; // кличка

    public void voice() {
        for (int i = 1; i <= age; i++) {
            System.out.println("гав-гав");
        }
    }
    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    public Dog(){
        name = "unknown";
    }
}


public class TestProject {
    public static void main(String[] args) {
       Dog Sobaka = new Dog("Tratata", 3);
       Sobaka.voice();
       System.out.println(Sobaka.name + " " + Sobaka.age);

       Dog tt = new Dog();
       System.out.println(tt.name);
    }
}

