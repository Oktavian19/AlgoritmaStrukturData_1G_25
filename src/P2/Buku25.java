package P2;

public class Buku25 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp." + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku25() {

    }

    public Buku25(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int jml) {
        return jml * harga;
    }

    int hitungDiskon(int jml) {
        double harTot = hitungHargaTotal(jml);
        double diskon = 0;
        if (harTot > 150000) {
            diskon = 0.12 * harTot;
        } else if (75000 < harTot && harTot < 150000) {
            diskon = 0.05 * harTot;
        }
        return (int) diskon;
    }

    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
}
