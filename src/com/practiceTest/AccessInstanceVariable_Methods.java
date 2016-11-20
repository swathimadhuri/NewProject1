package com.practiceTest;

/**
 * Created by Swathi.Battula on 18/11/2016.
 */
public class AccessInstanceVariable_Methods {
    int puppyAge;
    public AccessInstanceVariable_Methods(String name){
        System.out.println("My Puppu name is " +name);
    }
    public void SetAge(int age){
        puppyAge=age;
    }
    public int GetAge(){
        System.out.println("My Puppy age is " +puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        AccessInstanceVariable_Methods AIVM=new AccessInstanceVariable_Methods("Lucky");
        AIVM.SetAge(3);
        AIVM.GetAge();
        System.out.println("Age stored in Variable is "+AIVM.puppyAge);

    }
}
