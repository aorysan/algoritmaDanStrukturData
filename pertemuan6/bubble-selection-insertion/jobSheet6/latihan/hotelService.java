package latihan;

class hotelService {
    hotel[] list = new hotel[5];
    int x;

    void tambahHotel(hotel h) {
        if(x < list.length) {
            list[x] = h;
            x++;
        } else {
            System.err.println("Ruangan sudah penuh");
        }
    }

    void tampilAll() {
        for (hotel h : list) {
            h.tampilAll();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for(int i = 0; i < list.length-1; i++) {
            for(int j = 1; j < list.length-i; j++) {
                if(list[j].harga < list[j-1].harga) {
                    hotel tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int y = i;
            for(int j = i+1; j < list.length; j++) {
                if(list[j].bintang > list[y].bintang) {
                    y = j;
                }
            }
            hotel tmp = list[y];
            list[y] = list[i];
            list[i] = tmp;
        }
    }
}
