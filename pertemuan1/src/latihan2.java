import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Silahkan masukkan angka : ");
        double angka = sc.nextDouble();
        
        double n = angka % 100;

        System.out.println(n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }   
            }
        }
        sc.close();
    }
}
