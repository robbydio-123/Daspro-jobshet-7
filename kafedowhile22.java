import java.util.Scanner;

    public class kafedowhile22 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            int kopi,teh,roti;
            double harga_kopi = 12000, harga_teh = 7000, harga_roti = 20000, totalHarga;
            String nama_pelanggan;

            do {
            System.out.print("Masukkan Nama_Pelanggan (Ketik 'Batal' untuk keluar ): ");
            nama_pelanggan= scanner.nextLine();
            if (nama_pelanggan.equalsIgnoreCase("Batal")){
                System.out.println("Transaksi di Batalkan.");
                break;
            }
            System.out.print("Jumlah Kopi:");
            kopi= scanner.nextInt();
            System.out.print("Jumlah Teh:");
            teh= scanner.nextInt();
            System.out.print("Jumlah Roti:");
            roti= scanner.nextInt();

        

            totalHarga = (kopi * harga_kopi) + (teh * harga_teh) + (roti * harga_roti);
            System.out.println ("total yang harus di bayar: Rp " + totalHarga);
            scanner.nextLine();
         } while(true);

            
        }    
     }


