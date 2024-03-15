package percobaan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int fc = sc.nextInt();
        
        sum[] sm = new sum[fc];
        System.out.println("=================================================");
        for (int i = 0; i < fc; i++) {
            System.out.println("=================================================");
            System.out.println("Program Menghitung Keuntungan Total(satuan juta, misal 5.5)");
            System.out.print("Masukkan Jumlah Bulan : ");
            int elemen = sc.nextInt();
            sm[i] = new sum(elemen);
            for(int j = 0; j < elemen; j++) {
                System.out.print("Masukkan Keuntungan Bulan ke-" + (j + 1) + " : ");
                sm[j].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        for(int i = 0; i < fc; i++) {
            System.out.println(
                    "Total Keuntungan Perusahaan Selama " + sm[i].elemen + " Bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
        }
        System.out.println("=================================================");
        System.out.println("Algoritma Divide and Conquer");
        for(int i = 0; i < fc; i++) {
            System.out.println(
                    "Total Keuntungan Perusahaan Selama " + sm[i].elemen + " Bulan adalah "
                            + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }

        sc.close();
    }
}
