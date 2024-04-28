package konversi;

import java.util.Scanner;

public class postfixMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p, q;

        System.out.print("Masukkan ekspresi matematika (infix) : ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        postfix06 post = new postfix06(total);
        p = post.konversi(q);
        
        System.out.println("Postfix : " + p);

        sc.close();
    }
}
