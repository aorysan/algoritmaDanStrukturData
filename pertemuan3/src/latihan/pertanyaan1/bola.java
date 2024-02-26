package latihan.pertanyaan1;

public class bola {
    int rusuk;

    bola(int rusuk) {
        this.rusuk = rusuk;
    }

    double luasPermukaan() {
        return 4 * Math.PI * Math.pow(this.rusuk, 2);
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(rusuk, 3);
    }
}
