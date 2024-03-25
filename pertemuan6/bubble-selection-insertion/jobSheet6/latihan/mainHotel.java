package latihan;

public class mainHotel {
    public static void main(String[] args) {

        hotelService list = new hotelService();

        hotel h1 = new hotel("Ruang 1", "Malang", 230000, (byte)4);
        hotel h2 = new hotel("Ruang 2", "Malang", 210000, (byte)3);
        hotel h3 = new hotel("Ruang 3", "Malang", 240000, (byte)5);
        hotel h4 = new hotel("Ruang 4", "Malang", 200000, (byte)2);
        hotel h5 = new hotel("Ruang 5", "Malang", 220000, (byte)1);

        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);
        list.tambahHotel(h5);

        list.tampilAll();

        System.out.println();
        System.out.println();

        list.bubbleSort();
        list.tampilAll();

        System.out.println();
        System.out.println();

        list.selectionSort();
        list.tampilAll();
    }
}
