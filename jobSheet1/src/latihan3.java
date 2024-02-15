import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Program Menghitung Semester");
        System.out.println("===========================");

        System.out.print("Masukkan Nilai Angka untuk MK Pancasila : ");
        double pancasila = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Konsep Teknologi Informasi : ");
        double kti = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Critical Thinking and Problem Solving : ");
        double ctps = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Matematika Dasar : ");
        double md = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Bahasa Inggris : ");
        double bi = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Dasar Pemrograman : ");
        double dp = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Keselamatan dan Kesehatan Kerja : ");
        double kkk = sc.nextInt();

        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.println("Mata Kuliah\t\t\t\tNilai Angka\tNilai Huruf\t  Bobot Nilai");
        System.out.print("Pancasila\t\t\t\t" + pancasila);
        nilaiHuruf(pancasila);
        System.out.print("Konsep Teknologi Informasi\t\t" + kti);
        nilaiHuruf(kti);
        System.out.print("Critical Thinking and Problem Solving\t" + ctps);
        nilaiHuruf(ctps);
        System.out.print("Matematika Dasar\t\t\t" + md);
        nilaiHuruf(md);
        System.out.print("Bahasa Inggris\t\t\t\t" + bi);
        nilaiHuruf(bi);
        System.out.print("Dasar Pemrograman\t\t\t" + dp);
        nilaiHuruf(dp);
        System.out.print("Keselamatan dan Kesehatan Kerja\t\t" + kkk);
        nilaiHuruf(kkk);

        System.out.println("===========================");

        double ip = (ip(kkk) + ip(kti) + ip(md) + ip(pancasila) + ip(dp) + ip(bi) + ip(ctps)) / 7;
        System.out.println("ip : " + ip);

        sc.close();
    }

    static double ip (double y) {
        y /= 25;

        if (y > 3.50 && y <= 4.00) {
            y = 4.00;
        } else if (y > 3.00 && y <= 3.50) {
            y = 3.50;
        } else if (y > 2.50 && y <= 3.00) {
            y = 3.00;
        } else if (y > 2.00 && y <= 2.50) {
            y = 2.50;
        } else if (y > 1.50 && y <= 2.00) {
            y = 2.00;
        } else if (y > 1.00 && y <= 1.50) {
            y = 1.50;
        } else if (y <= 1.00) {
            y = 1.00;
        }

        return y;
    }

    private static double nilaiHuruf(double x) {

        x /= 25;

        if (x > 3.50 && x <= 4.00) {
            x = 4.00;
            System.out.print("\t\t\tA\t\t\t" + x + "\n");
        } else if (x > 3.00 && x <= 3.50) {
            x = 3.50;
            System.out.print("\t\t\tB+\t\t" + x + "\n");
        } else if (x > 2.50 && x <= 3.00) {
            x = 3.00;
            System.out.print("\t\t\tB\t\t\t" + x + "\n");
        } else if (x > 2.00 && x <= 2.50) {
            x = 2.50;
            System.out.print("\t\t\tC+\t\t\t" + x + "\n");
        } else if (x > 1.50 && x <= 2.00) {
            x = 2.00;
            System.out.print("\t\t\tC\t\t\t" + x + "\n");
        } else if (x > 1.00 && x <= 1.50) {
            x = 1.50;
            System.out.print("\t\t\tD\t\t\t" + x + "\n");
        } else if (x <= 1.00) {
            x = 1.00;
            System.out.print("\t\t\tE\t\t\t" + x + "\n");
        }

        return x;
    }

}
