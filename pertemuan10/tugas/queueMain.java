package tugas;

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
                    System.out.print("Nama\t\t: ");
                    String nama = sc.next();

                    System.out.print("No handphone\t: ");
                    int noHP = sc.nextInt();

                    pembeli antrian = new pembeli(nama, noHP);

                    q.enqueue(antrian);

                    break;
            
                case 2 :
                    q.dequeue();

                    break;

                case 3 :
                    System.out.println("1. Cek antrian terdepan");
                    System.out.println("2. Cek antrian terakhir");
                    System.out.println("3. Cek antrian tertentu");
                    System.out.print("Masukkan pilihan Anda : ");
                    pilih = sc.nextInt();

                    if(pilih == 1) {
                        q.peek();
                    } else if (pilih == 2) {
                        q.peekLast();
                    } else {
                        System.out.print("Masukkan nama antrian yang ingin Anda cek : ");
                        String namaCek = sc.next();
                        q.peeking(namaCek);
                    }

                    break;

                case 4 :
                    q.print();

                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        sc.close();
    }

    static void menu () {
        System.out.println("\n1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek semua antrian");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan operasi yang Anda inginkan : ");
    }
}
