package percobaan2;

public class pangkat {
    int nilai, pangkat;

    pangkat(int angka, int pangkat){
        this.nilai = angka;
        this.pangkat = pangkat;
    }

    int pangkatBF(int x, int y) {
        int hasil = 1;
        for (int i = 0; i < y; i++) {
            hasil *= x;
        }
        return hasil;
    }

    int pangkatDC(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            if (y % 2 == 1) {
                return (pangkatDC(x, y / 2) * pangkatDC(x, y / 2) * x);
            } else {
                return (pangkatDC(x, y / 2) * pangkatDC(x, y / 2));
            }
        }
    }
}
