package P3.BangunRuang;

public class BangunRuang {
    public static void main(String[] args) {
        Kerucut[] krcArr = new Kerucut[3];
        Limas[] lmsArr = new Limas[3];
        Bola[] blArr = new Bola[3];

        for (int i = 0; i < 3; i++) {
            krcArr[i] = new Kerucut(3, i + 4);
            lmsArr[i] = new Limas(5, 6 + i);
            blArr[i] = new Bola(2 * (i + 1));

            System.out.printf("Kerucut ke-%d\nVolume kerucut: %.1f\nLuas Permukaan Kerucut: %.1f\n\n", i + 1,
                    krcArr[i].hitungVolume(), krcArr[i].hitungLuasPerm());
            System.out.printf("Limas ke-%d\nVolume Limas: %.2f\nLuas Permukaan Limas: %.2f\n\n", i + 1,
                    lmsArr[i].hitungVolume(), lmsArr[i].hitungLuasPerm());
            System.out.printf("Bola ke-%d\nVolume Bola: %.1f\nLuas Permukaan Bola: %.1f\n\n", i + 1,
                    blArr[i].hitungVolume(), blArr[i].hitungLuasPerm());
        }
    }
}
