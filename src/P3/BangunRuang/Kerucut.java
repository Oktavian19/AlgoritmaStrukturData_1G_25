package P3.BangunRuang;

public class Kerucut {
    int jari2, sisiMiring;

    public Kerucut(int jari2, int sisiMiring) {
        this.jari2 = jari2;
        this.sisiMiring = sisiMiring;
    }

    public double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jari2, 2));
        double LuasAlas = Math.PI * Math.pow(jari2, 2);
        return 0.33 * Math.PI * LuasAlas * tinggi;
    }

    public double hitungLuasPerm() {
        return Math.PI * jari2 * (jari2 + sisiMiring);
    }
}
