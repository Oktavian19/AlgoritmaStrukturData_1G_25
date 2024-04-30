package P8.UTS_Okta;

import java.util.Scanner;

public class mainOkta {
    public static void main(String[] args) {

        Scanner scOkta = new Scanner(System.in);
        Scanner scStringOkta = new Scanner(System.in);

        boolean isDoneOkta = false;
        sortingOkta listOkta = new sortingOkta();

        while (true) {
            System.out.print("Pilih Menu : \n1. Isi data nasabah\n2. Tampilkan Seluruh Data Nasabah\n3. Sorting Data berdasarkan umur\n4. Pencarian data nasabah(dg. nama)\nMasukkan angka : ");
            int pilihOkta = scOkta.nextInt();

            switch (pilihOkta) {
                case 1:
                    for (int i = 0; i < listOkta.nbOkta.length; i++) {
                        System.out.println("\nNASABAH KE-" + (i+1));
                        System.out.print("Masukkan Nomor Rekening Nasabah : ");
                        String norekOkta = scStringOkta.nextLine();
                        System.out.print("Masukkan Nama Nasabah : ");
                        String namaOkta = scStringOkta.nextLine();
                        System.out.print("Masukkan NIK Nasabah : ");
                        String nikOkta = scStringOkta.nextLine();
                        System.out.print("Masukkan Umur Nasabah : ");
                        int umurOkta = scOkta.nextInt();
                        System.out.print("Masukkan Saldo Nasabah : ");
                        double saldoOkta = scOkta.nextDouble();
    
                        nasabahOkta nbOkta = new nasabahOkta(norekOkta, namaOkta, nikOkta, umurOkta, saldoOkta);
    
                        listOkta.tambah(nbOkta);
                    } 

                    isDoneOkta = true;
                    System.out.println("Pengisian data telah berhasil!");
                    scStringOkta.nextLine();

                    break;
                case 2:
                    if (!isDoneOkta) {
                        System.out.println("Isi data nasabah terlebih dahulu!");
                        scStringOkta.nextLine();
                    } else {
                        listOkta.tampilAll();
                    }
                    break;
                case 3:
                    if (!isDoneOkta) {
                        System.out.println("Isi data nasabah terlebih dahulu!");
                        scStringOkta.nextLine();
                    } else {
                        listOkta.sortUmurOkta();
                    }
                    break;
                case 4:
                    if (!isDoneOkta) {
                        System.out.println("Isi data nasabah terlebih dahulu!");
                        scStringOkta.nextLine();
                    } else {
                        searchingOkta schOkta = new searchingOkta();

                        System.out.print("Masukkan nama nasabah yang akan dicari : ");
                        String cariNbOkta = scStringOkta.nextLine();
                        System.out.println("Data Nasabah yang Dicari : ");
                        //listOkta.tampilOkta(schOkta.searchOkta(cariNbOkta, 0, listOkta.nbOkta.length - 1));
                        listOkta.tampilOkta(schOkta.searchOktaSeq(cariNbOkta));
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
