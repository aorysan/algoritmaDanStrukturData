package tugas;
public class mahasiswa {
    int nim;
    String nama;
    mahasiswa next;

    mahasiswa(int nim, String nama, mahasiswa next) {
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }
}
