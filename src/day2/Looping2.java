package day2;

import java.util.Scanner;

public class Looping2 {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        n = scan.nextInt();

        if(n % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
