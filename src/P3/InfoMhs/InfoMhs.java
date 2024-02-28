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

        double[] ipkAll = new double[data.length];
        for (int i = 0; i < ipkAll.length; i++) {
            ipkAll[i] = data[i].ipk;
        }

        System.out.printf("Rata-rata IPK : %.2f\n", rerataIpk(ipkAll));
        System.out.printf("Data Mahasiswa IPK tertinggi :\n");
        System.out.printf("Nama : %s\nNIM : %s\nJenis Kelamin : %s\nNilai IPK : %s\n\n",
                        data[IpkTertinggi(ipkAll)].nama, data[IpkTertinggi(ipkAll)].nim, data[IpkTertinggi(ipkAll)].JenKel, data[IpkTertinggi(data[0].ipk, data[1].ipk, data[2].ipk)].ipk);
    }

    static double rerataIpk(double... arr) {
        double total=0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total/arr.length;
    }
    
    static int IpkTertinggi(double... arr) {
        double max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
