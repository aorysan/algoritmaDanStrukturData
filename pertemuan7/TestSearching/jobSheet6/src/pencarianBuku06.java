package src;

public class pencarianBuku06 {
    buku06 listBuku[] = new buku06[5];
    int idx;

    void tambah(buku06 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (buku06 m : listBuku) {
            m.tampilDataBuku();
        }
    }

    int findSeqSearch(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (cari.equalsIgnoreCase(listBuku[i].kodeBuku)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    buku06 findBuku(String cari) {
        int posisi = -1;
        for(int i = 0; i < listBuku.length; i++) {
            if(cari.equalsIgnoreCase(listBuku[i].judulBuku)) {
                posisi = i;
                break;
            }
        }
        return listBuku[posisi];
    }

    int countJudul(String cari) {
        int counter = 0;
        for(int i = 0; i < listBuku.length; i++) {
            if(listBuku[i].judulBuku.equalsIgnoreCase(cari) && listBuku[i].judulBuku != null){
                counter++;
            }
        }
        return counter;
    }
    

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    void sort() {
        for (int i = 0; i < listBuku.length; i++) {
            for (int j = 1; j < listBuku.length; j++) {
                if (listBuku[j].kodeBuku.compareTo(listBuku[j].kodeBuku) < 0) {
                    buku06 temp = listBuku[i];
                    listBuku[i] = listBuku[j];
                    listBuku[j] = temp;
                }
            }
        }
    }

    void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("=============================");
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul Buku : " + listBuku[pos].judulBuku);
            System.out.println("Tahun terbit : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBuku[pos].pengarang);
            System.out.println("Stok : " + listBuku[pos].stok);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    int findBynarySearch(String cari, int left, int right) {
        int mid;

        if (right >= left) {
            mid = (right + left) / 2;
    
            if (cari.equals(listBuku[mid].kodeBuku)) {
                return mid;
            } else if (cari.compareTo(listBuku[mid].kodeBuku) == 0) {
                return mid;
            } else if (cari.compareTo(listBuku[mid].kodeBuku) < 0) {
                return findBynarySearch(cari, left, mid - 1);
            } else {
                return findBynarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

}
