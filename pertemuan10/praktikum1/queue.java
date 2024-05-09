public class queue {
    int data[];
    int front, rear, size, max;
    boolean over, under;

    queue(int n) {
        this.max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[this.front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != this.rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen : " + this.size);
        }
    }

    void clear() {
        if(!isEmpty()) {
            this.front = this.rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void enqueue(int dt) {
        if(isFull()){
            System.out.println("Queue penuh");
            over = true;
        } else {
            if(isEmpty()) {
                this.front = this.rear = 0;
            } else {
                if(this.rear == this.max - 1) {
                    this.rear = 0;
                } else {
                    this.rear++;
                }
            }
            data[this.rear] = dt;
            size++;
        }
    }

    int dequeue() {
        int dt = 0;

        if(isEmpty()) {
            System.out.println("Queue masih kosong");
            under = true;
        } else {
            dt = data[this.front];
            size--;

            if(isEmpty()) {
                this.front = this.rear = -1;
            } else {
                if(this.front == this.max -1) {
                    this.front = 0;
                } else {
                    this.front++;
                }
            }
        }
        return dt;
    }
}
