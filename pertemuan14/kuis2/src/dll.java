import java.util.Scanner;

public class dll {
    node head;

    dll() {
        head = null;
    }

    void printTotal() {
        node temp = head;

        System.out.println("\n============================================");
        System.out.println("         Hasil Akhir Perolehan Poin         ");
        System.out.println("============================================");

        while (temp != null) {
            int total = 0;

            for (int i = 0; i < 21; i++) {
                total += temp.pembalap.poin[i];
            }

            System.out.println("| " + temp.pembalap.nama + "\t\t: " + total + "\t\t     |");

            temp = temp.next;
        }
    }

    void eachSircuitPrint(int idSirkuit) {
        node temp = head;

        while (temp != null) {
            System.out.println("| " + temp.pembalap.nama + "\t\t: " + temp.pembalap.poin[idSirkuit] + "\t\t     |");
            temp = temp.next;
        }
    }

    void searchEachRacerPrint(String nama) {
        node temp = head;

        while (temp != null) {
            if(nama.equalsIgnoreCase(temp.pembalap.nama)) {
                System.out.println("| Hasil Perolehan poin " + temp.pembalap.nama);
                break;
            }
        }
    }

    void eachRacerPrint(String nama, int idSirkuit) {
        node temp = head;

        while (temp != null) {
            if(nama.equalsIgnoreCase(temp.pembalap.nama)) {
                System.out.print(temp.pembalap.poin[idSirkuit]);
                break;
            }
        }
    }
        

    void tambahPembalap(racer pembalap) {
        if (head == null) {
            head = new node(null, pembalap, null);
        } else {
            node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new node(temp, pembalap, null);
        }
    }

    void tambahPoin(int idSirkuit) {
        node temp = head;
        Scanner sc = new Scanner(System.in);
        int poin;

        while (temp != null) {
            System.out.print("Masukkan perolehan poin " + temp.pembalap.nama + "\t: ");
            poin = sc.nextInt();

            temp.pembalap.poin[idSirkuit] = poin;
            temp = temp.next;
        }
    }
}
