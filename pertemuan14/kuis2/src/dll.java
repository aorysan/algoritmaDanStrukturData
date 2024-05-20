import java.util.Scanner;

public class dll {
    node head;

    dll() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printTotal() {
        node temp = head;
        int total[] = new int[20];

        System.out.println("\n============================================");
        System.out.println("         Hasil Akhir Perolehan Poin         ");
        System.out.println("============================================");

        while (temp != null) {

            int j = 0;

            for (int i = 0; i < 21; i++) {
                total[j] += temp.pembalap.poin[i];
            }

            System.out.println("| " + temp.pembalap.nama + "\t\t: " + total + "\t\t     |");

            temp = temp.next;
            j++;
        }

        node current, index;
        racer tmp;
    
        if (!isEmpty()) {
            current = head;
            while (current != null) {
                index = current.next;
                int i = 0;
                while (index != null) {
                    if (total[i] < total[i+1]) {
                        tmp = current.pembalap;
                        current.pembalap = index.pembalap;
                        index.pembalap = tmp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            if(!isEmpty()) {
                node tem = head;
                
                System.out.println("===========");
                System.out.println("Daftar Film");
                System.out.println("===========");
                
                int i = 0;

                while(tem != null) {
                    System.out.println("ID\t: " + tem.pembalap.nama + total[i]);
                    System.out.println();
                    tem = tem.next;
                    i++;
                }
            } else {
                System.out.println("List kosong");
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat mengurutkan data!");
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
