import java.util.Scanner;

public class soal7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int produk1, produk2, produk3;
        int pajak1, pajak2, pajak3;
        System.out.print("Harga produk pertama: ");
        produk1 = scan.nextInt();
        System.out.print("Harga produk pertama: ");
        produk2 = scan.nextInt();
        System.out.print("Harga produk pertama: ");
        produk3 = scan.nextInt();
        int TotalProduk = produk1 + produk2 + produk3;
        int totalProdukrata = TotalProduk/3;
        System.out.println("Total Produk: "+ TotalProduk);
        pajak1 =  ((20 * produk1) /100)+produk1;
        pajak2 =  ((20 * produk2) /100)+produk2;
        pajak3 =  ((20 * produk3) /100)+produk3;
        int totalKenaPajak = (pajak1+pajak2+pajak3);
        int totalProdukpajakrata = totalKenaPajak/3;
        System.out.println("Total Produk setelah kena pajak: "+ totalKenaPajak);
        System.out.println("Rata-rata sebelum kena pajak: "+totalProdukrata);
        System.out.println("Rata-rata setelah kena pajak: "+totalProdukpajakrata);
    }
}
