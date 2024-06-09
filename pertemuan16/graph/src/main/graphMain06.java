package main;

import java.util.Scanner;
import graph.graph06;
import graph.graphMatriks06;
public class graphMain06 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        graph06 gedung = new graph06(6);
        graphMatriks06 gdg = new graphMatriks06(4);

        int pilih;

        do {
           menu();
           pilih = new Scanner(System.in).nextInt();

           switch (pilih) {
            case 1:
                System.out.print("Masukkan gedung asal : ");
                int asal = new Scanner(System.in).nextInt();
                System.out.print("Masukkan gedung tujuan : ");
                int tujuan = new Scanner(System.in).nextInt();
                System.out.print("Masukkan jarak : ");
                int jarak = new Scanner(System.in).nextInt();

                gedung.addEdge(asal, tujuan, jarak);
                
                break;

            case 2:
                System.out.print("Masukkan gedung asal : ");
                asal = new Scanner(System.in).nextInt();
                System.out.print("Masukkan gedung tujuan : ");
                tujuan = new Scanner(System.in).nextInt();
                gedung.removeEdge(asal, tujuan);

                break;
        
            case 3:
                System.out.print("Masukkan gedung asal : ");
                asal = new Scanner(System.in).nextInt();
                gedung.degree(asal);

                break;

            case 4:
                gedung.printGraph();
                
                break;

            case 5:
                System.out.print("Masukkan gedung asal : ");
                asal = new Scanner(System.in).nextInt();
                System.out.print("Masukkan gedung tujuan : ");
                tujuan = new Scanner(System.in).nextInt();

                if(gedung.cekTetangga(asal, tujuan) == true) {
                    System.out.println("Gedung " + (char)('A' + asal) + " terhubung dengan gedung " + (char)('A' + tujuan));
                } else {
                    System.out.println("Gedung " + (char)('A' + asal) + " tidak terhubung dengan gedung " + (char)('A' + tujuan));
                }
                
                break;

            case 6:
                gedung.removeAllEdges();
                System.out.println("Graph telah dikosongkan");

                break;

            case 7:
                System.out.println("Jumlah edge yang ada : ");
                gedung.hitungEdge();
                
                break;
            }
        } while (pilih < 8);
        
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        
        // System.out.println("Hasil setelah penghapusan edge : ");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // gdg.degree(0);
    }

    static void menu() {
        System.out.println("=====================================================");
        System.out.println("\nMenu : \n");
        System.out.println("1. Tambahkan edge");
        System.out.println("2. Hapus edge");
        System.out.println("3. Cek Degree");
        System.out.println("4. Print graph");
        System.out.println("5. Cek edge");
        System.out.println("6. Hapus semua edge");
        System.out.println("7. Jumlah edge\n");
        System.out.print("Silahkan pilih menu Anda : ");
    }
}
