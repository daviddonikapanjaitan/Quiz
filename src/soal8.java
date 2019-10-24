import java.util.Scanner;

public class soal8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double belian, diskon, setelahDiskon;
        System.out.print("Berapa harga yang anda beli: ");
        belian = scan.nextDouble();
        System.out.print("Berapa diskonnya: ");
        diskon = scan.nextDouble();
        setelahDiskon = belian - ((belian * diskon)/100);
        System.out.println("Total Harga setelah diskon: "+ setelahDiskon);
        System.out.println("Hemat: " +(belian-setelahDiskon));
    }
}
