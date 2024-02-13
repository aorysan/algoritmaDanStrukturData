package tugas;
import java.util.Arrays;
import java.util.Scanner;

public class pertanyaan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char plat[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan plat yang ingin Anda cari(A, B, D, E, F, G, H, L, N, T) : ");
        char cari = sc.next().charAt(0);

        for (int i = 0; i < plat.length; i++) {
            if (cari == plat[i]) {
                System.out.println(Arrays.toString(kota[i]));
            }
        }
        sc.close();
    }
}
