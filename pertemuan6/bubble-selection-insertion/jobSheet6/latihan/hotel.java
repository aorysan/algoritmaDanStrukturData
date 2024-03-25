package latihan;

class hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    hotel(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Kota : " + this.kota);
        System.out.println("Harga : Rp." + this.harga);
        System.out.println("Bintang : " + this.bintang);
    }
}
