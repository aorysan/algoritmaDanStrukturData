import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        faktorial[] fk = new faktorial[iJml];

        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.print("Hasil penghitungan faktorial " + (i+1) + " menggunakan metode Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
            System.out.println();
        }

        System.out.println("Hasil Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.print("Hasil penghitungan faktorial " + (i+1) + " menggunakan metode Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
            System.out.println();
        }

        sc.close();
    }
}