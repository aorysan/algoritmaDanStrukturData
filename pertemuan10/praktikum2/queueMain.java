package praktikum2;

import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pilih;
        
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();

        queue q = new queue(n);

        do{
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sc.next();

                    System.out.print("Nama : ");
                    String nama = sc.next();

                    System.out.print("Alamat : ");
                    String alamat = sc.next();

                    System.out.print("Umur : ");
                    int umur = sc.nextInt();

                    System.out.print("Saldo : ");
                    double saldo = sc.nextDouble();

                    nasabah nb = new nasabah(norek, nama, alamat, umur, saldo);

                    q.enqueue(nb);

                    break;
            
                case 2 :
                    nasabah data = q.dequeue();
                    
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && (data.umur) != 0 && (data.saldo) != 0) {
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }

                    break;

                case 3 :
                    q.peek();

                    break;

                case 4 :
                    q.peekrear();
                
                    break;
                
                case 5 :
                    q.print();

                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        sc.close();
    }

    static void menu () {
        System.out.println("Masukkan operasi yang Anda inginkan : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("4. Cek Semua Antrian");

        System.out.println("-----------------------------------");

    }
}
