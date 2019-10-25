package day2;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        int score;
        char charx = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        score = scan.nextInt();
        if(score>=90){
            charx = 'A';
        }else if(score < 90){
            charx = 'C';
        }

        System.out.println("Grade: " + charx);
    }
}
