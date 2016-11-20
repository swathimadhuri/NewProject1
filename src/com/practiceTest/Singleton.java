
/*
The Singleton's purpose is to control object creation, limiting the number of objects to only
        one. Since there is only one Singleton instance, any instance fields of a Singleton will occur
        only once per class, just like static fields
*/

/*The easiest implementation consists of a private constructor and a field to hold its result,
        and a static accessor method with a name like getInstance().
        The private field can be assigned from within a static initializer block or, more simply,
        using an initializer. The getInstance( ) method (which must be public) then simply returns
        this instance −*/



package com.practiceTest;

/**
 * Created by Swathi.Battula on 17/11/2016.
 */
public class Singleton {
   private static Singleton singleton=new Singleton();

    /*A private Constructor prevents any other
      class from instantiating.
    */
     private Singleton(){};

    /* Static 'instance' method */
   public static Singleton getInstance(){
       return singleton;
   }

    /* Other methods protected by singleton-ness */
   protected static void demomethod(){
       System.out.println("This is demo method");
   }
}
