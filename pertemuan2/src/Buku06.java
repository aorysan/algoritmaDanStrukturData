class Buku06 {
    String judul, pengarang;
    int halaman, stok, harga;
    int jumlah;

    void tampilInformasi() {
        System.out.println();
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);
        System.out.println();
    }

    void terjual(int jml) {
        this.jumlah = jml;
        if (this.stok > 0) {
            this.stok -= jml;
        } else if (jml > this.stok) {
            System.out.println("Jumlah yang ingin dibeli melebihi stok yang tersedia saat ini");
        }
    }

    void restok(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }

    public Buku06() {

    }

    public Buku06(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal() {
        int total = this.harga * this.jumlah;
        return total;
    }

    int hitungDiskon() {
        int diskon = 0;
        if (hitungHargaTotal() > 150000) {
            diskon = (int)(hitungHargaTotal() * 0.12);
        } else if (hitungHargaTotal() >= 75000 && hitungHargaTotal() <= 150000) {
            diskon = (int)(hitungHargaTotal() * 0.05);
        } else if (hitungHargaTotal() < 75000) {
            System.out.println("Tidak mendapat diskon");
        }

        return diskon;
    }

    int hitungHargaBayar() {
        int bayar = hitungHargaTotal() - (int)hitungDiskon();
        System.out.println("Total harga : " + hitungHargaTotal());
        System.out.println("Total diskon : " + hitungDiskon());
        System.out.println("Harga yang harus dibayar : " + bayar);
        return bayar;
    }
}
