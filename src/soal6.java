import java.util.Scanner;

public class soal6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tinggibadan, beratbadan, bmi;
        System.out.print("Masukkan tinggi badan: ");
        beratbadan = scan.nextDouble();
        System.out.print("Masukkan berat badan: ");
        tinggibadan = scan.nextDouble();
        double tinggibadan2 = tinggibadan * tinggibadan;
        double kalibmi = 703* beratbadan;
        bmi = kalibmi/ (tinggibadan2);
        System.out.println("BMI anda: "  +bmi);
    }
}
