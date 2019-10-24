import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        double hargamakanan, totalHargaMakanan,  pajak, tips;
        System.out.print("Masukkan Harga Makanan Anda: ");
        hargamakanan = scan.nextDouble();
        System.out.println("=============================");
        System.out.println("Harga Makanan: " + hargamakanan);
        pajak = 0.07 * hargamakanan;
        System.out.println("Pajak :" + pajak);
        tips = 0.1 * hargamakanan;
        System.out.println("Tips: " + tips);
        totalHargaMakanan = hargamakanan + pajak +tips;
        System.out.println("Total makanan: " + totalHargaMakanan);

    }
}
