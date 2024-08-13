package com.javacode.javalanguage;

public class ControlStatements {

    static void useTheCommaSeparator(){
        for(int i=1, j= i+10;i < 5;i++, j = i * 2){
            System.out.println("i= "+ i +" j: "+ j);
        }
    }



    static void switchColors(String inColor){
        switch(inColor){
            case "red":
                System.out.println("Colour Red has been switched to");
                break;

            case "green":
                System.out.println("Colour Green has been switched to");
                        break;
            case "yellow":
                System.out.println("Colour Yellow has been switched to");
                break;
            default:
                System.out.println("The default color is white");
        }
    }
    static void scoreSwitch(int score){
        switch(score){
            case 10:
                System.out.println("The student scored really low");
                break;
            case 20:
                System.out.println("The student scored low");
                break;
            case 30:
                System.out.println("The student scored bad");
                break;
            case 40:
                System.out.println("The student just below fair");
                break;
            case 50:
                System.out.println("The studennt score fair");
                break;
            default:
                System.out.println("The student scored above average");
        }
    }



    static void listAllLowerCase(){
        for(char c =0; c < 128; c++){


            if(Character.isLowerCase(c)){
                    System.out.println(c);
            }
        }
    }


        public static void main(String[] args) {
            listAllLowerCase();
            useTheCommaSeparator();
            scoreSwitch(40);
            switchColors("yellow");
            switchColors("blue");
        }
}
