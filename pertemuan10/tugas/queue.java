package tugas;

public class queue {
    pembeli data[];
    int front, rear, size, max;

    queue(int n) {
        this.max = n;
        data = new pembeli[max];
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
            System.out.println("Antrian terdepan: " + data[this.front].nama + "\nNo Handphone\t: " + data[this.front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void peekLast() {
        if(!isEmpty()) {
            System.out.println("Antrian terakhir : " + data[this.rear].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void peeking(String cekNama) {
        if(!isEmpty()) {
            for(int i = 0; i < size; i++) {
                if(cekNama.equalsIgnoreCase(data[i].nama)) {
                    System.out.println("Nama\t\t: " + data[i].nama + "\nNo Handphone\t: " + data[i].noHP);
                    System.out.println("Ada di posisi antrian ke : " + (i+1));
                    break;
                } else if (!cekNama.equalsIgnoreCase(data[i].nama)){
                    System.out.println("Antrian tidak ditemukan");
                    break;
                }
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while(i < this.size) {
                System.out.println("Nama\t:" + data[i].nama);
                System.out.println("Na HP\t:" + data[i].noHP);
                System.out.println();
                i++;
            }
            System.out.println("Jumlah antrian : " + this.size);
        }
    }


    void enqueue(pembeli antrian) {
        if(isFull()){
            System.out.println("Antrian penuh");
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
            data[this.rear] = antrian;
            size++;
        }
    }

    int dequeue() {

        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            pembeli temp[] = new pembeli[this.max];

            System.out.println("Antrian yang keluar\t: " + data[this.front].nama + "\nNo Handphone\t\t: " + data[this.front].noHP);

            for(int i = 0; i < this.max; i++) {
                temp[i] = data[i];
            }

            for(int i = 0; i < this.max; i++) {
                for(int j = i+1; j < this.max; j++) {
                    data[i] = temp[i+1];
                }
            }

            size--;

            if(isEmpty()) {
                this.front = this.rear = -1;
            } else {
                if(this.front == this.max -1) {
                    this.front = 0;
                } else {
                    return this.front;
                }
            }
        }
        return this.front;
    }
}
