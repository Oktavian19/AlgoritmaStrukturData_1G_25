package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.printf("Masukkan nilai data ke-%d : ", i + 1);
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("\nHASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.printf("Hasil penghitungan faktorial menggunakan Brute Force adalah %d\n",
                fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("\nHASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.printf("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah %d\n",
                fk[i].faktoralDC(fk[i].nilai));
        }
    }
}
