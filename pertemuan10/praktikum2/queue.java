package praktikum2;
public class queue {
    nasabah data[];
    int front, rear, size, max;

    public queue(int n) {
        this.max = n;
        data = new nasabah[max];
        size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan : " + data[this.front].norek + " " + data[this.front].nama + " " + data[this.front].alamat + " " + data[this.front].umur + " " + data[this.front].saldo);
        } else {
            System.out.println("Queue masih kosong.");
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = this.front;
            
            while(i != this.rear) {
                System.out.println(data[this.front].norek + " " + data[this.front].nama + " " + data[this.front].alamat + " " + data[this.front].umur + " " + data[this.front].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[this.front].norek + " " + data[this.front].nama + " " + data[this.front].alamat + " " + data[this.front].umur + " " + data[this.front].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if(!isEmpty()) {
            this.front = this.rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan.");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(nasabah dt) {
        if(isFull()) {
            System.out.println("Queue penuh");
        } else {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                if(rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public nasabah dequeue () {
        nasabah dt = new nasabah();
        if(isEmpty()) {
            System.out.println("Queue masih kosong.");
        } else {
            dt = data[front];
            size--;

            if(isEmpty()) {
                front = rear = -1;
            } else {
                if(front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}