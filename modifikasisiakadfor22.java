import java.util.Scanner;

public class modifikasisiakadfor22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai_lulus = 100;
        double nilai_tidaklulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();

         if (nilai < nilai_lulus) {
                nilai_tidaklulus = nilai;
            }
            if (nilai > nilai_lulus) {
                nilai_tidaklulus = nilai;

        System.out.println("Nilai tidaklulus: " + nilai_tidaklulus);
        System.out.println("Nilai lulus: " + nilai_lulus);


            }
        }
    }
    
}
