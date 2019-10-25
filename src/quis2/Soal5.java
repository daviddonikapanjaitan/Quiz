package quis2;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  a, b, c, d;
        System.out.print("Please insert number-1: ");
        a = scan.nextInt();
        System.out.print("Please insert number-2: ");
        b = scan.nextInt();
        System.out.print("Please insert number-3: ");
        c = scan.nextInt();
        System.out.print("Please insert number-4: ");
        d = scan.nextInt();
        if(a < 0 || b<0 || c <0 || d < 0){
            System.out.println("Among the given numbers, there is a negative one!");
        }else{
            System.out.println("another result");
        }
    }
}
