package praktikum;
public class singleLinkedList {
    node head, tail;

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
            node tmp = head;
    
            System.out.print("Isi linked list: ");
    
            while(tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);

        if(!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int input) {
        node ndInput = new node(input, null);

        if(!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node ndInput = new node(input, null);
        node temp = head;

        do {
            if(temp.data == key) {
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

    void insertAt(int index, int input) {
        node ndInput = new node(input, null);

        if(index > 0) {
            node temp = head;

            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new node(input, temp.next);

            if(temp.next.next == null) {
                tail = temp.next;
            }
        } else if(index == 0) {
            addFirst(input);
        } else {
            System.out.println("Tidak dapat menambahkan data jika index kurang dari 0");
        }
    }

    int getData(int index) {
        node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(int key) {
        node temp = head;
        int index = 0;

        while(temp != null && temp.data != key) {
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
            node temp = head;
            
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
            node temp = head;

            while(temp != null) {
                if(temp.data != key && temp != head) {
                    removeFirst();
                    break;
                } else if(temp.next.data == key) {
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
            node temp = head;

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
