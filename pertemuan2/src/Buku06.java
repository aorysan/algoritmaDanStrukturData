class Buku06 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);

    }

    void terjual(int jml) {
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
        int total = this.harga * (this.stok-terjual().stok);

        return total;
    }

    double hitungDiskon() {
        double diskon = 0;
        if (hitungHargaTotal() > 150000) {
            diskon = hitungHargaTotal() * 0.12;
        } else if (hitungHargaTotal() >= 75000 && hitungHargaTotal() <= 150000) {
            diskon = hitungHargaTotal() * 0.05;
        } else if (hitungHargaTotal() < 75000) {
            hitungHargaTotal();
        }

        return diskon;
    }

    int hitungHargaBayar() {
        int bayar = hitungHargaTotal() - (int)hitungDiskon();

        return bayar;
    }
}
