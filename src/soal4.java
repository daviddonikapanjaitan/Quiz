import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocity, time, range;
        System.out.println("Input percepatan mobile: ");
        velocity = scan.nextDouble();
        System.out.println("Input time/waktu: ");
        time = scan.nextDouble();
        range = (time*(velocity*velocity))/2;
        System.out.print("Jarak: "+  range);
    }
}
