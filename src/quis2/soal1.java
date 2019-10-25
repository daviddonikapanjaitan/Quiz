package quis2;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Please input number(Positive or negative): ");
        number = scan.nextInt();
        if(number>0){
            System.out.println("Number is  positive");
        }else if(number==0){
            System.out.println("Number is zero");
        }else {
            System.out.println("Number is not positive");
        }
    }
}
