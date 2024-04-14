package src;

import java.util.Scanner;

public class bukuMain06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku06 data = new pencarianBuku06();
        int jumlah = 5;

        System.out.println("==========================================");
        System.out.println("Masukkan data buku secara berurutan dari kode yang terkecil : ");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("==========================");
            System.out.print("Kode Buku\t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku\t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok\t\t: ");
            int stok = s.nextInt();

            buku06 m = new buku06(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }

        System.out.println("=============================================");
        System.out.println("           Data keseluruhan buku             ");
        System.out.println("=============================================");
        data.tampil();
        data.sort();
        
        System.out.println("-----------------------------------------");
        System.out.println("             Pencarian data              ");
        System.out.println("-----------------------------------------");

        System.out.println("1. Berdasarkan kode");
        System.out.println("2. Berdasarkan judul");
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan kode buku yang ingin dicari :");
                String cari = s1.nextLine();
                
                System.out.println("=========================================");
                System.out.println(" Pencarian menggunakan sequential search ");
                System.out.println("=========================================");
                int posisi = data.findSeqSearch(cari);
                data.tampilPosisi(cari, posisi);
                data.tampilData(cari, posisi);
                
                System.out.println("=========================================");
                System.out.println("   Pencarian menggunakan binary search   ");
                System.out.println("=========================================");
                posisi = data.findBynarySearch(cari, 0, jumlah - 1);
                data.tampilPosisi(cari, posisi);
                data.tampilData(cari, posisi);
                
                break;
                
            case 2:
                System.out.println("============================================================");
                System.out.println("  Pencarian menggunakan sequential search(pencarian judul)  ");
                System.out.println("============================================================");

                String cariJudul = s1.nextLine();
                int counter = data.countJudul(cariJudul);
                if(counter > 1) {
                    System.out.println("Terdapat lebih dari satu judul buku dalam data.");
                }

                buku06 dataBuku = data.findBuku(cariJudul);
                dataBuku.tampilDataBuku();

                break;
        }
        s.close();
        s1.close();
    }
}
