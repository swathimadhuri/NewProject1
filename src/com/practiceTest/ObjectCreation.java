package com.practiceTest;

/**
 * Created by Swathi.Battula on 18/11/2016.
 */
public class ObjectCreation {
    public ObjectCreation(String name){
        System.out.println("My name is " +name);
    }
    public static void main(String []args){
        ObjectCreation myname = new ObjectCreation("Sahasra");
    }
}
