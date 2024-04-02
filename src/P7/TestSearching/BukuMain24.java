package P7.TestSearching;

import java.util.Scanner;

public class BukuMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku24 data = new PencarianBuku24();
        int jmlBuku = 5;

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("===================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = sc.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = sc1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = sc.nextInt();
            Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===================\n");
        System.out.println("-----------------------------------------");

        System.out.println("Data Keseluruhan Buku");
        data.tampil();

        System.out.println("-----------------------------------------\n");
        System.out.println("_______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.print("Masukkan Kode Buku yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("\nMenggunakan Sequantial Search...");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        System.out.println("_______________________________________________\n");

        data.tampilData(cari, posisi);

    }
}
