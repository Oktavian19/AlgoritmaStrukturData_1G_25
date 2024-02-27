package P3;

public class ArraySegitiga {
    public static void main(String[] args) {
        int[] alas = { 10, 20, 15, 25 };
        int[] tinggi = { 4, 10, 6, 10 };

        Segitiga[] sgArray = new Segitiga[4];

        for (int i = 0; i < sgArray.length; i++) {
            sgArray[i] = new Segitiga(alas[i], tinggi[i]);
        }

        for (int i = 0; i < sgArray.length; i++) {
            System.out.printf("Segitiga ke-%d memiliki luas %d dan keliling %.2f\n", i, (int)sgArray[i].hitungLuas(), sgArray[i].hitungKeliling());
        }
    }
}
