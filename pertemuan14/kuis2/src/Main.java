import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dll list = new dll();
        Scanner scs = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        int pilih, idSirkuit;
        String sirkuit[] = {
            "1. Abu Dhabi", "2. Brazil", "3. AS", "4. Meksiko", "5. Jepang",
            "6. Rusia", "7. Singapura", "8. Italia", "9. Belgia", "10. Hungaria",
            "11. Jerman", "12. Inggris", "13. Austria", "14. Perancis", "15. Kanada",
            "16. Monako", "17. Spanyol", "18. Azerbaijan", "19. Tiongkok", "20. Bahrain", "21. Australia"
        };
        
        list.tambahPembalap(new racer(5, "S. Vettel"));
        list.tambahPembalap(new racer(44, "Hamilton"));
        list.tambahPembalap(new racer(77, "V. Bottas"));
        list.tambahPembalap(new racer(11, "S. Perez"));
        list.tambahPembalap(new racer(33, "Verstappen"));
        list.tambahPembalap(new racer(16, "C. Leclerc"));
        list.tambahPembalap(new racer(55, "C. Sainz"));
        list.tambahPembalap(new racer(4, "L. Norris"));
        list.tambahPembalap(new racer(3, "Ricciardo"));
        list.tambahPembalap(new racer(18, "L. Stroll"));
        list.tambahPembalap(new racer(10, "P. Gasly"));
        list.tambahPembalap(new racer(27, "Hulkenberg"));
        list.tambahPembalap(new racer(23, "A. Albon"));
        list.tambahPembalap(new racer(99, "Giovinazzi"));
        list.tambahPembalap(new racer(20, "Magnussen"));
        list.tambahPembalap(new racer(7, "Raikkonen"));
        list.tambahPembalap(new racer(26, "D. Kyvat"));
        list.tambahPembalap(new racer(63, "G. Russel"));
        list.tambahPembalap(new racer(88, "R. Kubica"));
        list.tambahPembalap(new racer(8, "Grosjean"));

        do{
            menu();
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = sci.nextInt();
            System.out.println();

            switch (pilih) {

                case 1:

                    list.printTotal();
                    
                    break;
            
                case 2:

                    System.out.println("\n==============================================");
                    System.out.println("   List Sirkuit Grand Prix Formula One 2019   ");
                    System.out.println("==============================================");

                    for (int i = 0; i < sirkuit.length; i++) {
                        System.out.println(sirkuit[i]);
                    }

                    System.out.print("Silahkan Pilih Sirkuit : ");
                    idSirkuit = sci.nextInt();

                    System.out.println("\n=============================================");
                    System.out.println("            Hasil Perolehan Poin            ");
                    System.out.println("=============================================");
                
                    list.eachSircuitPrint(idSirkuit);

                    break;

                case 4:

                    for (int i = 0; i < sirkuit.length; i++) {
                        System.out.println(sirkuit[i]);
                    }

                    System.out.print("Silahkan Pilih Sirkuit : ");
                    idSirkuit = sci.nextInt();

                    list.tambahPoin(idSirkuit);

                    break;
            }
        } while (pilih != 3);

    }

    static void menu() {
        System.out.println("\n=============================================");
        System.out.println("         Grand Prix Formula One 2019         ");
        System.out.println("=============================================\n");

        System.out.println("1. Tampilkan Hasil Akhir Perolehan Poin");
        System.out.println("2. Tampilkan Perolehan Poin Tiap Sirkuit");
        System.out.println("3. Hentikan Program");
        System.out.println("4. Masukkan Perolehan Poin");
    }
}
