package quis2;

import java.util.Scanner;

public class soal03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.print("Please enter a word: ");
        word = scan.nextLine();
        if(word.equals(word.toUpperCase())){
            System.out.println("It's a uppercase");
        }else{
            System.out.println("It's a lowercase");
        }
    }
}
