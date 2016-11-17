package com.practiceTest;

/**
 * Created by Swathi.Battula on 17/11/2016.
 */
public class FreshJuiceTest_enum {

    public static void main(String [] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.JuiceCupSize.Large;
        System.out.println(juice.size);

    }

}
