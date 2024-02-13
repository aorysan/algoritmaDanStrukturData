import java.util.Arrays;

public class latihan4 {
    public static void main(String[] args) {
        
        int hasil = pendapatan();
        
        System.out.println("Total Pendapatan : " + hasil);

        layu();
    }
    
    static int pendapatan () {

        int hasil = 0;

        int toko[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        for (int i = 0; i < toko.length; i++) {
            hasil += toko[i][0] * 75000;
        }
        
        for (int i = 0; i < toko.length; i++) {
            hasil += toko[i][1] * 50000;
        }

        for (int i = 0; i < toko.length; i++) {
            hasil += toko[i][2] * 60000;
        }

        for (int i = 0; i < toko.length; i++) {
            hasil += toko[i][3] * 10000;
        }
        
        return hasil;
    }

    static void layu () {
        int toko[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("Jumlah persediaan awal : ");
        for (int[] x : toko) {
            System.out.println(Arrays.toString(x));
        }
        
        int layu[] = {1, 2, 0, 5};
        
        for (int i = 0; i < layu.length; i++) {
            toko[3][i] -= layu[i];
        }
        
        System.out.println("Total persediaan setelah dihitung kembali bunga yang tidak layu");
        
        for (int[] x : toko) {
            System.out.println(Arrays.toString(x));
        }

    }
}
