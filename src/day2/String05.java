package day2;

import java.util.Scanner;

public class String05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "Hello Java Programmer";
        System.out.println("Length s : " + s.length());

        System.out.println("Index: " + s.indexOf("Java"));

        // substring untuk get
        System.out.println("substr: " + s.substring(6,10));
    }
}
