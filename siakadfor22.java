import java.util.Scanner;

public class siakadfor22 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai_terendah = 100;
        double nilai_tertinggi = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();

            if (nilai < nilai_terendah) {
                nilai_terendah = nilai;
            }
            if (nilai > nilai_tertinggi) {
                nilai_tertinggi = nilai;
            }
        }

        System.out.println("Nilai terendah: " + nilai_terendah);
        System.out.println("Nilai tertinggi: " + nilai_tertinggi);
    }
}