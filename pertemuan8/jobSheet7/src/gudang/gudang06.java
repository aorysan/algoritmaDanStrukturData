package gudang;
class gudang06 {
    barang06 tumpukan[];
    int size, top;

    gudang06(int kapasitas) {
        this.size = kapasitas;
        tumpukan = new barang06[this.size];
        top = -1;
    }

    boolean cekKosong() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if(top == size-1) {
            return true;
        } else {
            return false;
        }
    }
                        
    void tambahBarang(barang06 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang.\n");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh.");
        }
    }

    barang06 ambilBarang() {
        if(!cekKosong()) {
            barang06 hapus = tumpukan[top];
            top--;
            System.out.println("Barang " + hapus.nama + " diambil dari gudang.");
            System.out.println("Kode unik dalam biner : " + konversiDesumalkeBiner(hapus.kode));
            return hapus;
        } else {
            System.out.println("Barang kosong");
            return null;
        }
    }

    barang06 lihatBarangTeratas() {
        if(!cekKosong()) {
            barang06 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama + "\n");
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    void display() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang : ");
            for(int i = top; i >= top; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    String konversiDesumalkeBiner(int kode) {
        stackKonversi stack = new stackKonversi();

        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();

        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }

    void lihatBarangTerbawah() {
        for(int i = 0; i < size; i++) {
            if(tumpukan[i] != null) {
                System.out.println("Barang terbawah : " + tumpukan[i].nama + "\n");
                break;
            } else {
                System.out.println("Tumpukan barang kosong.");
            }
        }
    }

    boolean cariNama(String nama, int mulai) {
        if(nama.equalsIgnoreCase(tumpukan[mulai].nama)) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariNama(nama, mulai+1);
        }
    }

    boolean cariKode(int kode, int mulai) {
        if(kode == tumpukan[mulai].kode) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariKode(kode, mulai+1);
        }
    }
}