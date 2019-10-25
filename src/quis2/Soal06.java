package quis2;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Please insert first number: ");
        firstNumber = scan.nextInt();
        System.out.print("Please insert second number: ");
        secondNumber = scan.nextInt();
        if(firstNumber > secondNumber){
            int firstNumberX =  secondNumber;
            int secondNumberX = firstNumber;
            System.out.println("=============");
            System.out.println("Number one: " + firstNumberX);
            System.out.println("Number two: " + secondNumberX);
        }else{
            System.out.println("=============");
            System.out.println("Number one: " + firstNumber);
            System.out.println("Number two: " + secondNumber);
        }
    }
}
