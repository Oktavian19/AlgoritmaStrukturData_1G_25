package P13.Kuis2_Oktavian_Eka_Ramadhan_24;
import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) throws Exception {
        System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI =========");
        System.out.println("Dibuat oleh : Oktavian Eka Ramadhan");
        System.out.println("NIM         : 2341720117");
        System.out.println("Absen       : 24");
        System.out.println("===========================================");

        Scanner okta24 = new Scanner(System.in);
        Scanner oktaString24 = new Scanner(System.in);
        ListPembeli24 pembeli24 = new ListPembeli24();
        ListPesanan24 pesanan24 = new ListPesanan24();

        boolean tampilMenu24 = true;
        int antrian24 = 1;
        int antrianPesan24 = 1;

        while (tampilMenu24) {
            System.out.println("Sistem Antrian Resto");
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan pengurutan pesanan by nama"); //Ascending
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih(1-5)  : ");
            int pilih24 = okta24.nextInt();

            switch (pilih24) {
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("--------------------------");
                    System.out.println("Nomor Antrian : " + (antrian24));
                    System.out.print("Nama Customer : ");
                    String nama24 = oktaString24.nextLine();
                    System.out.print("Nomor Hp      : ");
                    String noHp24 = oktaString24.nextLine();
                    Pembeli24 pembeliBaru24 = new Pembeli24(antrian24, nama24, noHp24);
                    antrian24++;
                    pembeli24.addLast(pembeliBaru24);
                    break;

                case 2:
                    System.out.println("+++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++++++++++++");
                    System.out.println("No.\tNama Customer\tNo. Hp");
                    pembeli24.print();
                    System.out.println("Total Antrian : " + pembeli24.size24);
                    break;

                case 3:
                    System.out.println(pembeli24.getFirst().namaPembeli24 + " telah memesan Menu");
                    System.out.println("-----------------------");
                    System.out.println("Transaksi Input Pesanan");
                    System.out.println("-----------------------");
                    System.out.println("Nomor Pesanan : " + antrianPesan24);
                    System.out.print("Pesanan       : ");
                    String namaPesanan24 = oktaString24.nextLine();
                    System.out.print("Harga         : ");
                    int harga24 = okta24.nextInt();
                    Pesanan24 pesananBaru24 = new Pesanan24(antrianPesan24, namaPesanan24, harga24);
                    pesanan24.addLast(pesananBaru24);
                    

                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    System.out.println("No.\tNama Pesanan\tHarga");
                    pesanan24.print();

                    antrianPesan24++;
                    pembeli24.removeFirst();
                    break;

                case 4:
                    ListPesanan24 pesananUrut24 = pesanan24;
                    for (int i = 0; i < pesananUrut24.size24; i++) {
                        for (int j = 1; j < pesananUrut24.size24; j++) {
                            if (pesananUrut24.getNama(j).compareTo(pesananUrut24.getNama(j-1)) > 0) {
                                Pesanan24 tmp24 = pesananUrut24.get(j);
                                pesananUrut24.add(pesananUrut24.get(j - 1), j);
                                pesananUrut24.add(tmp24, j-1);
                            }
                        }
                    }
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("No.\tNama Pesanan\tHarga");
                    pesananUrut24.print();

                    break;
                
                case 5:
                    int sum24 = 0;
                    for (int i = 0; i < pesanan24.size24; i++) {
                        sum24 += pesanan24.getHarga(i);
                    }
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println("+++++++++++++++++++++");
                    System.err.println("Pendapatan hari ini : " + sum24);
                    break;
            
                case 6:
                    tampilMenu24 = false;
                    break;

                default:
                    break;
        }
        }
    }
}
