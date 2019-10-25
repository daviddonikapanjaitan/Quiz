package day2;

import java.util.Scanner;

public class loopinTeori {

    public static void main(String[] args) {
        int day, month;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input bulan: ");
        month = scan.nextInt();
        if(month==2){
            day = 28;
        }else if(month == 4 || month == 6 || month == 9 || month ==11){
            day = 30;
        }else{
            day = 31;
        }

        System.out.println("days in month:  " + month + " month " + day + " day");
    }
}
