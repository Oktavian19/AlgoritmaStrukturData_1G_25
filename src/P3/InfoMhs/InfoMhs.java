package P3.InfoMhs;

import java.util.Scanner;

public class InfoMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        dataMhs[] data = new dataMhs[3];

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Masukkan data mahasiswa ke-%d\n", i + 1);
            System.out.printf("Masukkan nama : ");
            String nama = scStr.nextLine();
            System.out.printf("Masukkan NIM: ");
            String nim = scStr.nextLine();
            System.out.printf("Masukkan Jenis Kelamin: ");
            String JenKel = scStr.nextLine();
            System.out.printf("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            System.out.println();

            data[i] = new dataMhs(nama, nim, JenKel, ipk);
        }

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Data Mahasiswa ke-%d\n", i + 1);
            System.out.printf("Nama : %s\nNIM : %s\nJenis Kelamin : %s\nNilai IPK : %s\n\n",
                        data[i].nama, data[i].nim, data[i].JenKel, data[i].ipk);
        }
    }
}
