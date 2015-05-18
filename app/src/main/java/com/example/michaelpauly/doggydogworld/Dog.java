package com.example.michaelpauly.doggydogworld;
import android.util.Log;

/**
 * Created by Michael Pauly on 5/14/2015.
 */
public class Dog {
    String Name;
    int Age;
    String Color;
    String Breed;

    Dog(String name, int age, String color, String breed) {
        Log.d("Dog", "constructing...");
        Name = name;
        Age = age;
        Color = color;
        Breed = breed;
    }

    public void bark() {
        String bark = Name + " barked";
        Log.d("Dog", bark);
    }

    public void barkAt(String victim) {
        String bark = Name + " barked at " + victim;
        Log.d("Dog", bark);
    }
}
