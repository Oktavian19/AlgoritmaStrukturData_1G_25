package P1;

public class royalGarden {
    public static void main(String[] args) {
        int[][] jmlBunga = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        for (int i = 0; i < jmlBunga.length; i++) {
            System.out.println("RoyalGarden " + (i + 1));
            pendapatan(jmlBunga[i]);
        }

        System.out.println("RoyalGarden 4");
        stock(jmlBunga[3]);
    }

    static void pendapatan(int[] arr) {
        int pendapatan = 0;
        int[] harga = { 75000, 50000, 60000, 10000 };
        for (int i = 0; i < arr.length; i++) {
            pendapatan += arr[i] * harga[i];
        }
        System.out.printf("Pendapatan yang diperoleh : %d\n\n", pendapatan);
    }

    static void stock(int[] arr) {
        String[] jenis = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] bungaMati = { 1, 2, 0, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nBunga %s\n", jenis[i]);
            System.out.printf("Jumlah awal : %d\n", arr[i]);
            System.out.printf("Bunga mati : %s\n", bungaMati[i]);
            System.out.printf("Stock saat ini : %d\n", (arr[i]-bungaMati[i]));
        }

    }
}
