import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilaipertama, nilaikedua, nilaiketiga, nilaikeempat,hasil;

        System.out.print("Input nilai ujian pertama: ");
        nilaipertama = scan.nextInt();
        System.out.print("Input nilai ujian kedua: ");
        nilaikedua = scan.nextInt();
        System.out.print("Input nilai ujian ketiga: ");
        nilaiketiga = scan.nextInt();
        System.out.print("Input nilai ujian keempat: ");
        nilaikeempat = scan.nextInt();
        hasil = (nilaipertama+nilaikedua+nilaiketiga+nilaikeempat)/4;
        System.out.println("Hasil nilai rata-rata 4 nilai ujian: "+ hasil);
    }
}
