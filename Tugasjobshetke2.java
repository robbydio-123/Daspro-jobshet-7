import java.util.Scanner;

public class Tugas2jobshet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis;
        int durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1. mobil , 2. montor, 0. Keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan jangka waktu parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500; 
                } else if (jenis == 1) {
                    System.out.print("mobil");
                    total += durasi * 3000;  
                } else if (jenis == 2) {
                    System.out.print("motor");
                    total += durasi * 2000; 
                    
                }
                System.out.println("Total yang harus di bayar patkir: Rp " + total);
        
            }

        } while (jenis != 0);

        System.out.println("Total yang harus di bayar parkir: Rp " + total);
        input.close();
    }
}
