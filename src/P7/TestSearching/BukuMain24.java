package P7.TestSearching;

import java.util.Scanner;

public class BukuMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku24 data = new PencarianBuku24();
        int jmlBuku = 5;

        String[] booksCode = {"111", "123", "125", "126", "127"};
        String[] booksTitle = {"Algoritma", "Big Data", "Desain UI", "Web Programming", "Etika Mahasiswa"};
        int[] yearRelease = {2019, 2020, 2021, 2022, 2023};
        String[] booksAuthor = {"Wahyuni", "Susilo", "Supriadi", "Pustaka Adi", "Darmawan Adi"};
        int[] booksStock = {5, 3, 3, 2, 2};

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            /*System.out.println("===================");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = sc1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = sc1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = sc.nextInt();
            Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);*/
            Buku24 m = new Buku24(booksCode[i], booksTitle[i], yearRelease[i], booksAuthor[i], booksStock[i]);
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

        /*System.out.print("Masukkan kode buku yang akan dicari : ");
        System.out.println("\nMencari data...");

        Buku24 dataBuku24 = data.FindBuku(cari);
        dataBuku24.tampilDataBuku();*/

        System.out.println("\nMenggunakan Binary Search..");
        posisi = data.findBinarySearch(cari, 0, jmlBuku - 1);
        data.tampilPosisi(cari, posisi);
        System.out.println("_______________________________________________\n");
        data.tampilData(cari, posisi);
        System.out.println("_______________________________________________\n");

        System.out.println("_______________________________________________");
        System.out.println("Pencarian Data dengan tipe data kode buku String: ");
        System.out.print("Masukkan Kode Buku yang dicari : ");
        String cariString = sc1.nextLine();
        System.out.println("\nMenggunakan Sequantial Search...");
        System.out.println(data.findSeqSearchString(cariString));
        System.out.println("_______________________________________________\n");
        data.tampilData(cari, posisi);

        System.out.println("\nMenggunakan Binary Search..");
        System.out.println(data.findBinarySearchString(cariString, 0, jmlBuku - 1));
        System.out.println("_______________________________________________\n");
        data.tampilData(cari, posisi);
        System.out.println("_______________________________________________\n");

        System.out.println("_______________________________________________");
        System.out.println("Pencarian Judul : ");
        System.out.print("Masukkan Judul Buku yang dicari : ");
        String cariJudul = sc1.nextLine();
        System.out.println("\nMenggunakan Sequantial Search...");
        int idx = data.findSeqTitle(cariJudul);
        data.tampilPosisi(idx + 1, idx);
        System.out.println("_______________________________________________\n");
        data.tampilData(idx + 1, idx);

        System.out.println("\nMenggunakan Binary Search..");
        posisi = data.findBinaryTitle(cariJudul, 0, jmlBuku - 1);
        data.tampilPosisi(idx + 1, idx);
        System.out.println("_______________________________________________\n");
        data.tampilData(idx + 1, idx);
        System.out.println("_______________________________________________\n");

    }
}
