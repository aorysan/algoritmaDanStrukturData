package tugas.film;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        dll q = new dll();
        Scanner sc = new Scanner(System.in);

        int pilih;
        
        System.out.println("\n=====================");
        System.out.println("Data Film Layar Lebar");
        System.out.println("=====================");
        
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    q.addFirst(input());
                    
                    break;
                    
                case 2:
                    q.addLast(input());
                    
                    break;
                    
                case 3:
                    System.out.println("Masukkan data film : ");
                    film data = input();

                    System.out.print("Film ini akan diletakkan pada urutan ke-");
                    int index = sc.nextInt();
                    
                    q.add(data, index);
                    break;

                case 4:
                    q.removeFirst();

                    break;

                case 5:
                    q.removeLast();

                    break;

                case 6:
                    System.out.print("Urutan film ke- berapa yang ingin Anda hapus : ");
                    index = sc.nextInt();

                    q.remove(index);

                    break;

                case 7:
                    q.print();

                    break;

                case 8:
                    System.out.print("Masukkan id film yang ingin Anda cari : ");
                    int id = sc.nextInt();

                    q.search(id);

                    break;
                
                case 9:
                    q.sortDesc();

                    break;

            }
        } while (pilih != 0);

        sc.close();
    }
    
    static void menu() {
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data pada index tertentu");
        System.out.println("4. Hapus data awal");
        System.out.println("5. Hapus data akhir");
        System.out.println("6. Hapus data pada index tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID film");
        System.out.println("9. Urutan rating film(DESC)");
        System.out.println("0. Exit");
        
        System.out.print("Silahkan pilih menu Anda : ");
    }
    public static film input() {
        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);

        System.out.print("Masukkan id film\t: ");
        int id = sci.nextInt();

        System.out.print("Masukkan judul film\t: ");
        String nama = scs.nextLine();

        System.out.print("Masukkan rating film\t: ");
        double rating = scd.nextDouble();

        System.out.println();

        return new film(id, nama, rating);
    }
}
