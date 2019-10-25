package quis2;

import java.util.Scanner;

public class soal04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String length;
        System.out.print("Please input word: ");
        length = scan.nextLine();
        if(length.length()>20){
            System.out.println("Many characters");
        }else{
            System.out.println("Not many characters");
        }
    }
}
