package com.ridezum;

public class Main {
    public static void main(String[] args){
        revers("Iluminati");
    }

    public static void revers(String str){

        char[] arrChar = str.toCharArray();
        char temp;

        for (int i = 0; i < arrChar.length/2; i++){
            temp = arrChar[i];
            arrChar[i] = arrChar[arrChar.length-1-i];
            arrChar[arrChar.length-1-i] = temp;
        }

        String str1 = new String(arrChar);
        System.out.println(str1);
    }
}
