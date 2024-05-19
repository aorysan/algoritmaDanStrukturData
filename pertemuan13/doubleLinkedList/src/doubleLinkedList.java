public class doubleLinkedList {
    node head;
    int size;

    doubleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        if(isEmpty()) {
            head = new node(null, data, null);
        } else {
            node newNode = new node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int data) {
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
        }
    }

    void add(int data, int index) throws Exception {
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
            } else {
                node newNode = new node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    int size() {
        return size;
    }

    void clear() {
        this.head = null;
        this.size = 0;
    }

    void print() {
        if(!isEmpty()) {
            node tmp = head;
            
            while(tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
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

        current.next = null;
        size--;
    }

    void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void remove(int index) throws Exception {
        if(isEmpty() || index >= size) {
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
            } else if(current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            
            size--;
        }
    }

    int getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("List masih kosong");
        }

        return head.data;
    }

    int getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("List masih kosong");
        }
        
        node tmp = head;

        while(tmp.next != null) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    int get(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("Nilai index melebihi batas");
        }

        node tmp = head;

        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }
}
