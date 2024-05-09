package tugas;
public class SLL {
    mahasiswa head, tail;

    boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            mahasiswa tmp = head;
    
            System.out.print("Isi linked list: ");
    
            while(tmp != null) {
                System.out.print(tmp.nim + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int nim, String nama) {
        mahasiswa ndInput = new mahasiswa(nim, nama, null);

        if(!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        mahasiswa ndInput = new mahasiswa(nim, nama, null);

        if(!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String nama) {
        mahasiswa ndInput = new mahasiswa(input, nama, null);
        mahasiswa temp = head;

        do {
            if(temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                
                if(ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while(temp == null);
    }

    void insertAt(int index, int nim, String nama) {
        mahasiswa ndInput = new mahasiswa(nim, nama, null);

        if(index > 0) {
            mahasiswa temp = head;

            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new mahasiswa(nim, nama, temp.next);

            if(temp.next.next == null) {
                tail = temp.next;
            }
        } else if(index == 0) {
            addFirst(nim, nama);
        } else {
            System.out.println("Tidak dapat menambahkan nim jika index kurang dari 0");
        }
    }

    int getData(int index) {
        mahasiswa temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.nim;
    }

    int indexOf(int key) {
        mahasiswa temp = head;
        int index = 0;

        while(temp != null && temp.nim != key) {
            temp = temp.next;
            index++;
        }

        if(temp == null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            mahasiswa temp = head;
            
            while(temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            mahasiswa temp = head;

            while(temp != null) {
                if(temp.nim != key && temp != head) {
                    removeFirst();
                    break;
                } else if(temp.next.nim == key) {
                    temp.next = temp.next.next;

                    if(temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            mahasiswa temp = head;

            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            
            if(temp.next == null) {
                tail = temp;
            }
        }
    }
}
