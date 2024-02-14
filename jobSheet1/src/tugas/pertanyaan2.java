package tugas;
import java.util.Scanner;

public class pertanyaan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int s = 0, v = 0, t = 0;

        System.out.println("apa yang ingin Anda cari ? ");
        System.out.println("1. jarak\n2. kecepatan\n3. waktu");
        String cari = sc.next();
        
        switch (cari) {
            case "1":

                jarak(t, v);
                
                break;
                
            case "2":
                
                kecepatan(s, t);
                
                break;
                
            case "3":
                
                waktu(s, v);

                break;
        
            default:
                System.out.println("input yang anda masukkan tidak valid");
                break;
            }

        sc.close();
    }

    static int jarak (int t, int v) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan kecepatan : ");
        v = sc.nextInt();
        System.out.print("masukkan waktu : ");
        t = sc.nextInt();

        int s = v * t;
        System.out.print("hasilnya adalah : " + (double)s);

        sc.close();

        return s;
    }
    static int kecepatan (int s, int t) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jarak : ");
        s = sc.nextInt();
        System.out.print("masukkan waktu : ");
        t = sc.nextInt();

        int v = s / t;
        System.out.print("hasilnya adalah : " + (double)v);

        sc.close();

        return s;
    }
    static int waktu (int s, int v) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jarak : ");
        s = sc.nextInt();
        System.out.print("masukkan kecepatan : ");
        v = sc.nextInt();

        int t = s / v;
        System.out.print("hasilnya adalah : " + (double)t);

        sc.close();

        return s;
    }
}
