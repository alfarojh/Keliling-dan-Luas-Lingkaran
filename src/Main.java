import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Untuk mengambil input dari CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari = ");
        double radius = scanner.nextInt();


        // Untuk memprint hasil ke CLI
        System.out.printf("Keliling lingkaran : %.2f\n", kelilingLingkaran(radius));
        System.out.printf("Luas lingkaran : %.2f\n", luasLingkaran(radius));
    }

    // Menghitung keliling lingkaran
    public static double kelilingLingkaran(double jari){
        return 2 * Math.PI * jari;
    }
    // Menghitung luas lingkaran
    public static double luasLingkaran(double jari){
        return Math.PI * jari * jari;
    }
}