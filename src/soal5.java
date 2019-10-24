import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double farenheit,  celcius;
       System.out.println("Farenheit: ");
       farenheit = scan.nextDouble();
       double formulakiri=5/9;
       double formulakanan=(farenheit-32);
        celcius = ((farenheit - 32)*5)/9;
       double formula=formulakiri*formulakanan;
       System.out.println("Celcius: "+celcius);
       double minue = 0.3 * -4;
       System.out.println(minue);
    }
}
