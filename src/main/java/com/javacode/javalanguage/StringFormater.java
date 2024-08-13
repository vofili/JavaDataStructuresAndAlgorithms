package com.javacode.javalanguage;

import java.util.Date;
import java.text.DecimalFormat;

public class StringFormater {


    static void customFormatter(String pattern,double value){
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String output = decimalFormat.format(value);
        System.out.println("value: "+value+" Pattern: "+pattern+ " = "+output);
    }

    static void testFormatter(){
        Date today = new Date();
        double age = 633425.0D;
        int userRating = -25;
        System.out.printf("The User Rating is: %+,d%n",userRating);
        System.out.printf("%,-10.3f%n",age);
        System.out.printf("Todays Date is: %te-%tB-%tY%n", today,today,today);

        System.out.printf("The date is %tD%n",today);

    }

    public static void main(String[] args) {
       // testFormatter();

      //  customFormatter("###,###.##",100000D);
        customFormatter("$000000.00",189.782);
    }
}
