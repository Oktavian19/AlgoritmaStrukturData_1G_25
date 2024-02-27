package P3;

public class ArraySegitiga {
    public static void main(String[] args) {
        int[] alas = { 10, 20, 15, 25 };
        int[] tinggi = { 4, 10, 6, 10 };

        Segitiga[] sgArray = new Segitiga[4];

        for (int i = 0; i < sgArray.length; i++) {
            sgArray[i] = new Segitiga(alas[i], tinggi[i]);
        }
    }
}
