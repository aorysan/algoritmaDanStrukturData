package tugas.vaksin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        dll q = new dll();
        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        int pilih;
        
        System.out.println("\n+++++++++++++++++++++++++++++");
        System.out.println("Pengantri Vaksin Extravaganza");
        System.out.println("+++++++++++++++++++++++++++++\n");
        
        do {
            menu();
            pilih = sci.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.println("\n+++++++++++++++++++++++++++++");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("+++++++++++++++++++++++++++++\n");
                    
                    System.out.print("Masukkan nomor penerima : ");
                    int no = sci.nextInt();

                    System.out.print("Masukkan nama : ");
                    String nama = scs.nextLine();

                    q.addLast(no, nama);

                    break;

                case 2:
                    q.removeFirst();

                    break;

                case 3:
                    q.print();

                    break;
            }
        } while (pilih != 4);

        sci.close();
        scs.close();
    }
    
    static void menu() {
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data penerima vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        
        System.out.print("Silahkan pilin menu Anda : ");
    }
}
