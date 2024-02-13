package P1;
import java.util.Scanner;


public class hitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] jenis = {"Tugas", "Kuis", "UTS", "UAS"};
        int[] bobot = {20, 20, 30, 30};
        int[] nilai = new int[4];

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Masukkan Nilai %s : ", jenis[i]);
            nilai[i] = sc.nextInt();
            if (nilai[i] > 100 || nilai[i] < 0) {
                System.out.println("Nilai Tidak Valid!");
                i--;
            }
        }

        int jml = 0; 
        for (int i = 0; i < nilai.length; i++) {
            jml += nilai[i] * bobot[i];
        }
        double nilaiAkhir = jml/100;
        System.out.printf("\n\nNilai Akhir : %.1f\n", (nilaiAkhir));

        System.out.printf("Nilai Huruf : ");
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("D");
        } else if (nilaiAkhir <= 39) {
            System.out.println("E");
        }

        if (nilaiAkhir>50) {
            System.out.println("\n\nSELAMAT ANDA LULUS!");
        } else {
            System.out.println("\n\nANDA TIDAK LULUS!");
        }
    }
}
