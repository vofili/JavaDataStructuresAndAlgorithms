package com.javacode.javalanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {


    public static void main(String[] args) {

        String myname = "aab8";

        System.out.println( myname.matches("[a-zA-Z][a-zA-Z0-9_]{2,3}"));
    }
}
