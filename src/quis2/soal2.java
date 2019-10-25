package quis2;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, number2;
        System.out.println("Please input number: ");
        number = scan.nextInt();
        System.out.println("Please input number 2: ");
        number2 = scan.nextInt();
        if(number > 0 && number2 > 0){
            System.out.println("TwoNumber is positive");
        }else if(number==0||number2==0){
            System.out.println("one of  number is zero or two of therm");
        }else{
            System.out.println("one of number is not positive");
        }
    }
}
