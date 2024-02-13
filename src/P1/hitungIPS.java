package P1;

import java.util.Scanner;

public class hitungIPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LIST MATKUL
        // BING[0], CTPS[1], DASPRO[2], K3[3], KTI[4], MATDAS[5], PANCASILA[6],
        // PRAK_DASPRO[7]

        String[] matkul = { "Bahasa Inggris", "Critical Thinking dan Problem Solving", "Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
                "Praktikum Dasar Pemrograman" };

        int[] nilaiAngka = new int[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];

        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("Masukkan nilai angka untuk Mata Kuliah %s : ", matkul[i]);
            nilaiAngka[i] = sc.nextInt();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            } else {
                System.out.println("Nilai tidak sesuai!");
                i--;
            }
        }

        System.out.printf("\n\nMata Kuliah%s Nilai Angka    Nilai Huruf      Bobot Nilai\n", " ".repeat(29));
        for (int i = 0; i < nilaiAngka.length; i++) {
            int space = 14;
            if (nilaiAngka[i]==100) {space--;}
            else if (nilaiAngka[i] < 10) {space++;}
            System.out.printf("%s%s %d%s %s%s %.2f\n", matkul[i], " ".repeat(40 - matkul[i].length()), nilaiAngka[i],
                    " ".repeat(space), nilaiHuruf[i], " ".repeat(15-nilaiHuruf[i].length()), nilaiSetara[i]);
        }

        double[] sks = {2, 2, 2, 2, 2, 3, 2, 3};
        double jml = 0;
        for (int i = 0; i < nilaiSetara.length; i++) {
            jml += (nilaiSetara[i] * sks[i]);
        }
        
        System.out.printf("\n\nIPS = %.2f", (jml/18));
    }
}
