package day2;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String java = "JAVA";

        String test = String.valueOf(java.charAt(3))+String.valueOf(java.charAt(2))+String.valueOf(java.charAt(1))
                +String.valueOf(java.charAt(0));
        System.out.println(test);
        System.out.println(java);
        int revere =  + java.charAt(2) + java.charAt(1) + java.charAt(0);
        System.out.println(""+java.charAt(3) + java.charAt(2) + java.charAt(1) + java.charAt(0));
    }
}
