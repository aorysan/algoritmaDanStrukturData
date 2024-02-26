package latihan.pertanyaan1;

public class limasSegiEmpat {
    int sisi;
    int tinggi;

    limasSegiEmpat(int sisi, int tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    double luasPermukaan() {
        return (this.sisi * this.sisi)
                + (0.5 * this.sisi * this.sisi + ((this.sisi / 2) * Math.sqrt(2) * ((this.sisi / 2) * Math.sqrt(2))));
    }

    double volume() {
        return (1.0 / 3.0) * this.sisi * this.sisi * ((this.sisi / 2) * Math.sqrt(2));
    }
}
