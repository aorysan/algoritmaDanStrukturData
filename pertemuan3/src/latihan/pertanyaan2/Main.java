package latihan.pertanyaan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rerata = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jml = sc.nextInt();
        Double[] rating = new Double[jml];

        mahasiswa[] mhs = new mahasiswa[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Mahasiswa ke : " + (i + 1));
            mhs[i] = new mahasiswa();
            mhs[i].input();
            rerata += mhs[i].ipk;
            rating[i] = mhs[i].ipk;
        }

        for (int i = 0; i < jml; i++) {
            mhs[i].display();
        }

        double rata = rataIPK(rerata, mhs.length);
        System.out.print("Rata-rata : " + rata);

        System.out.println();

        double tertinggi = rating(rating, mhs.length);
        System.out.print("Nilai tertinggi : " + tertinggi);

        sc.close();
    }

    static double rataIPK(double rata, int jml) {
        return rata / jml;
    }

    static double rating(Double[] IPK, int jml) {
        double tertinggi = 0;

        for(int i = 0; i < jml; i++) {
            if (tertinggi < IPK[i]) {
                tertinggi = IPK[i];
            }
        }
        return tertinggi;
    }
}
