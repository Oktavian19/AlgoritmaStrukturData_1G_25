package P3.BangunRuang;

public class Limas {
    int sisiAlas, tinggi;

    public Limas(int sisiAlas, int tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return 0.33 * Math.pow(sisiAlas, 2) * tinggi;
    }

    public double hitungLuasPerm() {
        return Math.pow(sisiAlas, 2) * (4 * (0.5 * (sisiAlas / 2) * (Math.hypot(tinggi, sisiAlas / 2))));
    }
}
