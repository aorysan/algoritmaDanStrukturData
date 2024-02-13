package tugas;
import java.util.Scanner;

public class pertanyaan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("apa yang ingin Anda cari ? ");
        System.out.println("1. jarak\n2. kecepatan\n3. waktu");
        String cari = sc.next();

        switch (cari) {
            case "1":
                System.out.print("masukkan kecepatan : ");
                int v = sc.nextInt();
                System.out.print("masukkan waktu : ");
                int t = sc.nextInt();

                int s = v * t;
                System.out.print("hasilnya adalah : " + (double)s);
                
                break;
                
            case "2":
                System.out.print("masukkan jarak : ");
                s = sc.nextInt();
                System.out.print("masukkan waktu : ");
                t = sc.nextInt();

                v = s / t;
                System.out.print("hasilnya adalah : " + (double)v);
                
                break;
                
            case "3":
                System.out.print("masukkan jarak : ");
                s = sc.nextInt();
                System.out.print("masukkan kecepatan : ");
                v = sc.nextInt();

                t = s / v;
                System.out.print("hasilnya adalah : " + (double)t);

                break;
        
            default:
                System.out.println("input yang anda masukkan tidak valid");
                break;
        }
        sc.close();
    }
}
