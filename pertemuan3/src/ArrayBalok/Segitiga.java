package ArrayBalok;

public class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return 2 * sisiMiring + alas;
    }
}
