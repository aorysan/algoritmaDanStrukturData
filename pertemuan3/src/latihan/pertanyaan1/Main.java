package latihan.pertanyaan1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        

        System.out.print("Masukkan jumlah elemen untuk array kerucut : ");
        int jmlArray = a.nextInt();

        kerucut[] krc = new kerucut[jmlArray];

        for(int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan panjang rusuk : ");
            int r = a.nextInt();
            System.out.print("Masukkan panjang selimut : ");
            int s = b.nextInt();
            krc[i] = new kerucut(r, s);
            double luas = krc[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = krc[i].volume();
            System.out.println("Volume : " + vol);
        }
        
        System.out.print("Masukkan jumlah elemen untuk array limas segiempat sama sisi : ");
        jmlArray = a.nextInt();
        
        limasSegiEmpat[] lms = new limasSegiEmpat[jmlArray];
        
        for(int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan panjang sisi : ");
            int s = a.nextInt();
            System.out.print("Masukkan panjang sisi miring : ");
            int sm = b.nextInt();
            lms[i] = new limasSegiEmpat(s, sm);
            double luas = lms[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = lms[i].volume();
            System.out.println("Volume : " + vol);
        }
        
        System.out.print("Masukkan jumlah elemen untuk array bola : ");
        jmlArray = a.nextInt();
        
        bola[] bl = new bola[jmlArray];
        
        for(int i = 0; i < jmlArray; i++) {
            System.out.print("masukkan panjang rusuk : ");
            int r = a.nextInt();
            bl[i] = new bola(r);
            double luas = bl[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = bl[i].volume();
            System.out.println("Volume : " + vol);
        }

        a.close();
        b.close();
    }
}
