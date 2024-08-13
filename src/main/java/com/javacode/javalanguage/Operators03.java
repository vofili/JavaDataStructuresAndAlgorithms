package com.javacode.javalanguage;

public class Operators03 {

    static void resetCars(Car car){
        car.color="invisible";
    }

    static void testMethodReference(){

        Car myCar = new Car();
        myCar.color = "red";
        System.out.println("myCar color: "+myCar.color);
        resetCars(myCar);
        System.out.println("myCar color: "+myCar.color);
    }

    static void mathematicalOperators(){
//        Random rand = new Random(47);
//        int i,j,k;
//        j = rand.nextInt(100)+1;
//        k = rand.nextInt(100)+1;
//        System.out.printf("j := %d  k := %d%n",j,k);
//        i = j + k;
//        System.out.println("j + k: "+i);
//        i = j - k;
//        System.out.println("j - k: "+i);
//        i = j / k;
//        System.out.println("j / k: "+i);
//        i = j * k;
//        System.out.println("j * k: "+i);
//        i = j % k;
//        System.out.println("j % k: "+i);

        int a = 6,b = 3;
        int x = a - b;
        System.out.printf("a - b = %d%n",x);
        x = a*-b;
        System.out.printf("a * -b = %d%n",x);
    }
    static void autoInc(){
        int i = 1;
        System.out.println("i = "+ i);
        System.out.println("i++ = "+ i++);
        System.out.println("++i = "+ ++i);
        System.out.println("i = "+i);
        System.out.println("i-- = "+i--);
        System.out.println("--i = "+ --i);
        System.out.println("i = "+ i);
    }

    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
    //    mathematicalOperators();
    //    autoInc();
//        Integer i1 = new Integer(128);
//        Integer i2 = new Integer(128);
        //literals

        //BITWISE OPERATIONS & | ^ ~

//        int hexa = 0xADF1;
//        System.out.printf("%s%n",hexa);
//        System.out.println(Integer.toBinaryString(hexa));

        String myName ="Valentine Ofili";
        for(char x:myName.toCharArray()){
            System.out.println(x+"-");
        }



    }
}

class Car{
    String color;
}
