package P3.ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga() {
    }

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + Math.hypot(tinggi, alas);
    }
}
