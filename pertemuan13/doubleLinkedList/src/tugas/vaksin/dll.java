package tugas.vaksin;

public class dll {
    node head;
    int size;

    dll() {
        this.head = null;
        this.size = 0;
    }
    
    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int no, String nama) {
        if(isEmpty()) {
            head = new node(null, no, nama, null);
            System.out.println("Berhasil ditambahkan\n");
        } else {
            node newNode = new node(null, no, nama, head);
            head.prev = newNode;
            head = newNode;
            System.out.println("Berhasil ditambahkan\n");
        }
        size++;
    }

    void addLast(int no, String nama) {
        if(isEmpty()) {
            addFirst(no, nama);
        } else {
            node current = head;
            while(current.next != null) {
                current = current.next;
            }

            node newNode = new node(current, no, nama, null);
            current.next = newNode;
            size++;
            
            System.out.println("Berhasil ditambahkan\n");
        }
    }

    int size() {
        return size;
    }

    void print() {
        if(!isEmpty()) {
            node tmp = head;
            
            System.out.println("\n+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++\n");
            
            while(tmp != null) {
                System.out.println(tmp.no + "\t" + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("List kosong");
        }
    }

    void removeLast() throws Exception {
        if(isEmpty()) { 
            throw new Exception("List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            System.out.println("\n" + head.nama + " telah divaksinasi\n");
            head = null;
            size--;
            return;
        }

        node current = head;
        
        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    void removeFirst() throws Exception {
        if(isEmpty()) {
            System.out.println("List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            System.out.println("\n" + head.nama + " telah divaksinasi\n");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
