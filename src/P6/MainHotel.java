package P6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel[] h = new Hotel[5];
        h[0] = new Hotel("Purnama Hotel", "Malang", 50000, (byte)1);
        h[1] = new Hotel("Chloe Hotel", "Malang", 150000, (byte)3);
        h[2] = new Hotel("ZamZam Hotel", "Batu", 250000, (byte)5);
        h[3] = new Hotel("GajahMada Hotel", "Lawang", 200000, (byte)2);
        h[4] = new Hotel("Sukun Hotel", "Pandaan", 125000, (byte)4);
        
        for (int i = 0; i < h.length; i++) {
            list.tambah(h[i]);
        }

        System.out.println("Daftar Hotel sebelum sorting");
        System.out.println("----------------------------");
        list.tampilAll();
        System.out.println();

        System.out.println("Daftar Hotel berdasarkan Harga");
        System.out.println("------------------------------");
        list.bubblesort(true); //true:sort by Harga, false:sort by bintang
        list.tampilAll();
        System.out.println();

        System.out.println("Daftar Hotel berdasarkan Bintang");
        System.out.println("--------------------------------");
        list.bubblesort(false);
        list.tampilAll();
    }
}
