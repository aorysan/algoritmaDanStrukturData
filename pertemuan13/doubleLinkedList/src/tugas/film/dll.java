package tugas.film;

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

    void addFirst(film data) {
        if(isEmpty()) {
            head = new node(null, data, null);
            System.out.println("Berhasil ditambahkan\n");
        } else {
            node newNode = new node(null, data,  head);
            head.prev = newNode;
            head = newNode;
            System.out.println("Berhasil ditambahkan\n");
        }
        size++;
    }

    void addLast(film data) {
        if(isEmpty()) {
            addFirst(data);
        } else {
            node current = head;
            while(current.next != null) {
                current = current.next;
            }

            node newNode = new node(current, data, null);
            current.next = newNode;
            size++;
            
            System.out.println("Berhasil ditambahkan\n");
        }
    }

    void add(film data, int index) throws Exception {
        if(isEmpty()) {
            addFirst(data);
        } else if(index < 0 || index > size) {
            throw new Exception("Index melebihi batas");
        } else {
            node current = head;
            int i = 0;
            
            while (i < index) {
                current = current.next;
                i++;
            }

            if(current.prev == null) {
                node newNode = new node(null, data, current);
                current.prev = newNode;
                head = newNode;
                System.out.println("\nBerhasil ditambahkan\n");
            } else {
                node newNode = new node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
                System.out.println("\nBerhasil ditambahkan\n");
            }
            size++;
        }
    }

    void print() {
        if(!isEmpty()) {
            node tmp = head;
            
            System.out.println("===========");
            System.out.println("Daftar Film");
            System.out.println("===========");
            
            while(tmp != null) {
                System.out.println("ID\t: " + tmp.data.id);
                System.out.println("Judul\t: " + tmp.data.judul);
                System.out.println("Rating\t: " + tmp.data.rating);
                System.out.println();
                tmp = tmp.next;
            }
        } else {
            System.out.println("List kosong");
        }
    }

    void removeLast() throws Exception {
        if(isEmpty()) { 
            throw new Exception("List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            head = null;
            size--;
            return;
        }

        node current = head;
        
        while(current.next.next != null) {
            current = current.next;
        }

        System.out.println(current.next.data.judul + " telah dihapus\n");
        current.next = null;
        size--;
    }

    void removeFirst() throws Exception {
        if(isEmpty()) {
            System.out.println("List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            System.out.println(head.data.judul + " telah dihapus\n");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void remove(int index) throws Exception {
        if(isEmpty() || index > size) {
            throw new Exception("Index melebihi batas");
        } else if(index == 0) {
            removeFirst();
        } else {
            node current = head;

            int i = 0;

            while(i < index) {
                current = current.next;
                i++;
            }

            if(current.next == null) {
                current.prev.next = null;
                System.out.println(head.data.judul + " telah dihapus\n");
            } else if(current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
                System.out.println(head.data.judul + " telah dihapus\n");
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println(head.data.judul + " telah dihapus\n");
            }
            
            size--;
        }
    }

    void search(int id) {
        int posisi = -1;
        node current = head;
        int i = 1;
        
        while(current != null) {
            if(current.data.id == id) {
                posisi = i;
                break;
            }
            current = current.next;
            i++;
        }

        if (posisi != -1) {
            System.out.println("\nData Id Film: " + id + ", berada pada urutan ke-" + posisi);
            System.out.println("\nIDENTITAS");
            System.out.println("  ID Film\t: " + current.data.id);
            System.out.println("  Judul Film\t: " + current.data.judul);
            System.out.println("  Rating Film\t: " + current.data.rating);
            System.out.println();
        } else {
            System.out.println("Data Id Film: " + id + ", tidak ditemukan");
        }
    }

    void sortDesc() {
        node current, index;
        film temp;
    
        if (!isEmpty()) {
            current = head;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            print();
        } else {
            System.out.println("Linked list masih kosong, tidak dapat mengurutkan data!");
        }
    }
}
