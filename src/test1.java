import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputData, angka1, angka2, angka3, angka4;
        System.out.print("Input Empat digit data: ");
        inputData = scan.nextInt();
        angka1 = inputData%10;
        angka2 = (inputData/10) %10;
        angka3 = (inputData/100)%10;
        angka4 = inputData/1000;
        System.out.println(angka1+" "+angka2+" "+angka3+" "+angka4);
        System.out.println("Hasil data: " + (angka1+angka2+angka3+angka4));
    }
}
