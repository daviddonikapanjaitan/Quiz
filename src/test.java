import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 4357;
        int b  =  4357 % 1000;
        int c  =  b % 100;
        int d  =  c % 10;
        int e  =  a % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        int sum = 0;
        while(a >= 1){
            int calculate = a % 10;
            sum+=calculate;
            a = a/ 10;
        }
        System.out.println(sum);
    }
}
