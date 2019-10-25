package quis2;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, mean;
        System.out.print("Please input New York location-1: ");
        a = scan.nextInt();
        System.out.print("Please input New York location-2: ");
        b = scan.nextInt();
        System.out.print("Please input New York location-3: ");
        c = scan.nextInt();
        mean = (a + b + c)/3;
        if(mean>60){
            System.out.println("Heat Wave");
        }else{
            System.out.println("Normal");
        }
    }
}
