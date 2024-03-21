package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPer = sc.nextInt();
        Sum perusahaan[] = new Sum[jmlPer];

        for (int i = 0; i < jmlPer; i++) {
            System.out.println("\nPERUSAHAAN " + (i + 1));
            System.out.println("============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();

            perusahaan[i] = new Sum(elm);

            System.out.println("==============================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.printf("Masukkan untung bulan ke-%d : ", j + 1);
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < jmlPer; i++) {
            System.out.println("\nPERUSAHAAN " + (i + 1));
            System.out.println("=======================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f\n", perusahaan[i].elemen,
                    perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("=======================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f\n", perusahaan[i].elemen,
                    perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, (perusahaan[i].elemen - 1)));
        }
    }
}
