package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int Nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            int Pangkat = sc.nextInt();
            png[i] = new Pangkat(Nilai, Pangkat);
        }

        System.out.println("\nPilih metode:\n1.Brute Force\n2.Divide Conquer");
        System.out.print("Masukkan angka: ");
        int pil = sc.nextInt();

        int hasil[] = new int[elemen];

        switch (pil) {
            case 1:
                System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    hasil[i] = png[i].pangkatBF(png[i].nilai, png[i].pangkat);
                }
                break;
            case 2:
                System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    hasil[i] = png[i].pangkatDC(png[i].nilai, png[i].pangkat);
                }
                break;
            default:
                break;
        }

        for (int i = 0; i < elemen; i++) {
            System.out.printf("Hasil dari %d pangkat %d adalah %d\n",
                    png[i].nilai, png[i].pangkat, hasil[i]);
        }

        /*
        System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.printf("Hasil dari %d pangkat %d adalah %d\n", png[i].nilai, png[i].pangkat,
                    png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.printf("Hasil dari %d pangkat %d adalah %d\n", png[i].nilai, png[i].pangkat,
                    png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        */
    }
}
