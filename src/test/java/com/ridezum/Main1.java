package com.ridezum;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Java");
        arr.add("JS");
        arr.add("Piton");
        arr.add("Rube");
        arr.add("SQL");

//        for (int i = 0; i < arr.size(); i++){
//            System.out.println(arr.get(i));
//        }

        for (String element: arr) {
            System.out.println(element);
        }
    }
}
