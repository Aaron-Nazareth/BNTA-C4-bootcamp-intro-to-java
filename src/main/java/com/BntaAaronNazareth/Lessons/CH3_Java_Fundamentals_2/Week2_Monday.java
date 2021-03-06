package com.BntaAaronNazareth.Lessons.CH3_Java_Fundamentals_2;

public class Week2_Monday {
    public static void main(String[] args) {
        // TOPIC: If statements and use of switch

        String hello = "Hola";

//        if (hello.toLowerCase().equals("hello")) {
//            System.out.println("English");
//        }
//        else if (hello.toLowerCase().equals("hola")) {
//            System.out.println("Spanish");
//        }
//        else {
//            System.out.println("Language not supported");
//        }

        switch (hello.toLowerCase()) {
            // Alternative to use else if statements
            case "hello":
                System.out.println("English");
                break;
            case "hola":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("Language not supported");
        }
    }
}
