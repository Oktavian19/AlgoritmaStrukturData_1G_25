package P2;

public class BukuMain25 {
    public static void main(String[] args) {
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku25 bukuOkta = new Buku25("Tutorial Object", "Oktavian Eka Ramadhan", 15, 2, 30000);
        bukuOkta.tampilInformasi();
    }
}
