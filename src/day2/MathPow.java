package day2;

import java.util.Scanner;

public class MathPow {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        double s, v0, a, t;

        System.out.print("Jarak: ");
        s = scan.nextDouble();

        System.out.print("Percepatan: ");
        a = scan.nextDouble();

        t = Math.sqrt((2*s)/a);

        int t1 = (int)t;

        System.out.println("Hasil t: " + t);
        System.out.println("Convert to integer: " + t1);
        System.out.println("Hasil t: " + Math.round(t));
        System.out.println("Hasil t bulatkan keatas: " + Math.ceil(t));
    }
}
