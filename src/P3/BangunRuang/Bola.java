package P3.BangunRuang;

public class Bola {
    int jari2;

    public Bola(int jari2) {
        this.jari2 = jari2;
    }

    public double hitungVolume() {
        return 4/3 * Math.PI * Math.pow(jari2, 3);
    }

    public double hitungLuasPerm() {
        return 4 * Math.PI * Math.pow(jari2, 2);
    }
}
