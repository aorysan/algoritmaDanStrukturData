import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Perhitungan Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        if (tugas < 100 && tugas > 0) {
            if (kuis < 100 && kuis > 0) {
                if (uts < 100 && uts > 0) {
                    if (uas < 100 && uas > 0) {
                        double nA = (double)tugas*0.2 + kuis*0.2 + uts*0.3 + uas*0.4;
                        System.out.println("Nilai Akhir : " + nA);

                        if (nA > 80 && nA <= 100) {
                            System.out.println("Nilai Huruf : A");
                        } else if (nA > 73 && nA <= 80) {
                            System.out.println("Nilai Huruf : B+");
                        } else if (nA > 65 && nA <= 73) {
                            System.out.println("Nilai Huruf : B");
                        } else if (nA > 60 && nA <= 65) {
                            System.out.println("Nilai Huruf : C+");
                        } else if (nA > 50 && nA <= 60) {
                            System.out.println("Nilai Huruf : C");
                        } else if (nA > 39 && nA <= 50) {
                            System.out.println("Nilai Huruf : D");
                        } else if (nA <= 39) {
                            System.out.println("Nilai Huruf : E");
                        }
                
                        System.out.println("===============================");
                        if (nA > 39 && nA <= 100) {
                            System.out.println("Selamat Anda Lulus");
                        }
                    } else {
                        System.out.println("Nilai tidak valid");
                    }
                } else {
                    System.out.println("Nilai tidak valid");
                }
            } else {
                System.out.println("Nilai tidak valid");
            }
        } else {
            System.out.println("Nilai tidak valid");
        }


        sc.close();
    }
}
