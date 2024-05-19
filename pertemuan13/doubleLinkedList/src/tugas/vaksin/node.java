package tugas.vaksin;

public class node {
    int no;
    String nama;
    node next, prev;

    node(node prev, int no, String nama, node next) {
        this.prev = prev;
        this.no = no;
        this.nama = nama;
        this.next = next;
    }
}
