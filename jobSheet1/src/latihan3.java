import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Program Menghitung Semester");
        System.out.println("===========================");

        System.out.print("Masukkan Nilai Angka untuk MK Pancasila : ");
        int pancasila = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Konsep Teknologi Informasi : ");
        int kti = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Critical Thinking and Problem Solving : ");
        int ctps = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Matematika Dasar : ");
        int md = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Bahasa Inggris : ");
        int bi = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Dasar Pemrograman : ");
        int dp = sc.nextInt();
        System.out.print("Masukkan Nilai Angka untuk MK Keselamatan dan Kesehatan Kerja : ");
        int kkk = sc.nextInt();

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

        

        sc.close();
    }

    private static int nilaiHuruf(int x) {

        if (x > 80 && x <= 100) {
            System.out.print("\t\tA\t\t" + "  4.00\n");
        } else if (x > 73 && x <= 80) {
            System.out.print("\t\tB+\t\t" + "  3.50\n");
        } else if (x > 65 && x <= 73) {
            System.out.print("\t\tB\t\t" + "  3.00\n");
        } else if (x > 60 && x <= 65) {
            System.out.print("\t\tC+\t\t" + "  2.50\n");
        } else if (x > 50 && x <= 60) {
            System.out.print("\t\tC\t\t" + "  2.00\n");
        } else if (x > 39 && x <= 50) {
            System.out.print("\t\tD\t\t" + "  1.00\n");
        } else if (x <= 39) {
            System.out.print("\t\tE\t\t" + "  0\n");
        }

        return x;
    }

}
