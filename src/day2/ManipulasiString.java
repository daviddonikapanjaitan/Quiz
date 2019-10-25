package day2;

import java.util.Scanner;

public class ManipulasiString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String hello = "Hello Java Developer";
        System.out.println(hello);
        System.out.println("Index ke-1: " + hello.charAt(0));
        System.out.println("Index ke-8 " + hello.charAt(8));
        System.out.println("Index ke-10 " + hello.charAt(10));
    }
}
