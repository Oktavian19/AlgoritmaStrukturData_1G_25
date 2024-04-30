package P9;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        Gudang24 gudang = new Gudang24(7);

        boolean menu = true;

        while (menu) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scString.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scString.nextLine();
                    
                    Barang24 barangBaru = new Barang24(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang24();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.\n");
                    break;
            }
        }
    }
}
