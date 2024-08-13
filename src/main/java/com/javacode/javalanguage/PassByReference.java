package com.javacode.javalanguage;

/**
 * Hello world!
 *
 */
public class PassByReference
{

    static void showSystemProperties(){
        System.getProperties().list(System.out);
    }

    public static void main( String[] args )
    {
            Tank t1 = new Tank();
            Tank t2 = new Tank();
            t1.level = 99;
            t2.level = 2;

            System.out.println("T1 Level: "+t1.level+" T2 Level:"+t2.level);
            t1 = t2;
            System.out.println("T1 Level: "+t1.level+" T2 Level:"+t2.level);
            t2.level = 50;
            System.out.println("T1 Level: "+t1.level+" T2 Level:"+t2.level);
            t1.level = 10;
        System.out.println("T1 Level: "+t1.level+" T2 Level:"+t2.level);


    }
}

class Tank{
    int level;
}
