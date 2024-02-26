package latihan.pertanyaan2;
import java.util.Scanner;

public class mahasiswa {
    Scanner sc = new Scanner(System.in);
    long nim;
    String nama;
    double ipk;
    char kelamin;

    void input() {
        System.out.print("Masukkan nama Mahasiswa : ");
        this.nama = sc.nextLine();
        System.out.print("Masukkan nim Mahasiswa : ");
        this.nim = sc.nextLong();
        System.out.print("Masukkan jenis kelamin mahasiswa(p/l) : ");
        this.kelamin = sc.next().charAt(0);
        System.out.print("Masukkan IPK Mahasiswa : ");
        this.ipk = sc.nextDouble();
        System.out.println();
    }

    void display() {
        System.out.println("Nama Mahasiswa : " + this.nama);
        System.out.println("NIM Mahasiswa : " + this.nim);
        System.out.println("Jenis kelamin Mahasiswa : " + this.kelamin);
        System.out.println("IPK Mahasiswa : " + this.ipk);
    }

}
