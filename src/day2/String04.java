package day2;

import java.util.Scanner;

public class String04 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String s, st, rt;
        s = "Hello .NET Developer welcome to Xsis Academy";
        System.out.println(s);
        st = s.replace(".NET", "JAVA")
                .replace("welcome", "hello")
                .replace("Xsis Academy", "XA")
        .toUpperCase();
        // Replace welcome jadi hello
        System.out.println("After replace: " + st);
    }
}
