package com.javacode.datastructures.strings;

public class Decipher {


    public static void main(String[] args) {
        String cipherText = "ZPV EP VTF B DBFTBS DJQIFS";

        String knownWord="USE";
        String clearText = decipherText(cipherText,knownWord);
        System.out.println(clearText);
    }

    public static String decipherText(String cipherText, String knownWord){
      //  cipherText = cipherText.replaceAll("\\s+","");
        knownWord=knownWord.replaceAll("\\s+","");


        //find the shiftt
        int shift=findShift(cipherText,knownWord);

        if(shift==-1){
            return "known word not found";
        }

        return applyShift(cipherText,shift);
    }

    static String applyShift(String text,int shift){
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < text.length();i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c) ? 'A':'a';
                char decipheredChar = (char)((c-base-shift+26)%26+base);
                sb.append(decipheredChar);

            }else{
                sb.append(c);
            }
        }


        return sb.toString();
    }


    static int findShift(String cipherText,String knownWord){
        for(int i = 0;i < cipherText.length()-knownWord.length();i++){
            String subText = cipherText.substring(i, i+knownWord.length());
            int shift = (subText.charAt(0)-knownWord.charAt(0)+26) % 26;

            if(applyShift(subText,shift).equals(knownWord)){
                return shift;
            }
        }
         return -1;

    }
}

