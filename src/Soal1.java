import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sudutPertama, sudutKedua, sudutKetiga;

        System.out.print("Input sudut pertama segitiga: ");
        sudutPertama = scan.nextInt();
        System.out.print("Input sudut kedua segitiga: ");
        sudutKedua = scan.nextInt();
        System.out.println("Input sudut akhir: " + (180-(sudutPertama + sudutKedua)));
        System.out.println("Total Sudut segitiga 180 derajat");
    }
}
