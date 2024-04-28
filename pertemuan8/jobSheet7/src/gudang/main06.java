package gudang;
import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        System.out.println("Selamat datang di Gudang!");
        System.out.print("Silahkan masukkan kapasitas gudang : ");
        int kapasitas = scanInt.nextInt();

        gudang06 gudang = new gudang06(kapasitas);

        System.out.println("\nSelamat datang dalam sistem gudang!");
        System.out.println("===================================\n");

        while(true) {
            System.out.println("Menu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang");
            System.out.println("5. Pencarian");
            System.out.println("6. Keluar");

            System.out.print("\nSilahkan pilih menu yang Anda inginkan : ");
            int pilihan = scanInt.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan kode barang : ");
                    int kode = scanInt.nextInt();

                    System.out.print("Masukkan nama barang : ");
                    String nama = scanStr.nextLine();

                    System.out.print("Masukkan kategori : ");
                    String kategori = scanStr.nextLine();

                    barang06 barangBaru = new barang06(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);

                    break;
            
                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.display();
                    break;

                case 4:
                    System.out.println("1. Barang teratas\n2. Barang terbawah");
                    pilihan = scanInt.nextInt();

                    switch (pilihan) {
                        case 1:
                            gudang.lihatBarangTeratas();
                            break;
                    
                        case 2:
                            gudang.lihatBarangTerbawah();
                            break;
                    }

                    break;

                case 5:
                    System.out.println("1. Pencarian berdasarkan nama\n2. Pencarian berdasarkan kode\n");
                
                    System.out.print("Silahkan pilih pencarian : ");
                    int cari = scanInt.nextInt();

                    switch (cari) {
                        case 1:
                        System.out.print("Masukkan nama barang yang ingin dicari : ");
                        String cariNama = scanStr.nextLine();
                        gudang.cariNama(cariNama, 0);
                            
                            break;
                    
                        default:
                        System.out.print("Masukkan kode barang yang ingin dicari : ");
                        int cariKode = scanInt.nextInt();
                        gudang.cariKode(cariKode, 0);
                            break;
                    }


                case 6:
                    System.exit(0);
                    break;
            }
        }
        
    }
}
