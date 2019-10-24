import java.util.Scanner;

public class soal09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kwh, totalBiaya, pajaKwh, total;
        System.out.print("Berapa kwh anda ? ");
        kwh = scan.nextDouble();
        System.out.println("Total biaya kwh: ");
        totalBiaya = kwh * 15000;
        pajaKwh = 0.2 * totalBiaya;
        System.out.println("========================");
        System.out.println("KWH anda: "+kwh);
        System.out.println("Total Biaya : "+ totalBiaya);
        System.out.println("Pajak: " + pajaKwh);
        System.out.println("Total: "+(totalBiaya+pajaKwh));
    }
}
