package P15;

import java.util.Scanner;

public class GraphMain24 {
    public static void main(String[] args) throws Exception {
        Graph24 gedung = new Graph24(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2,3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        checkAdjacency(gedung);
        System.out.println("");
        checkAdjacency(gedung);
    }

    static void checkAdjacency(Graph24 check) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gedung asal : ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = sc.nextInt();
        if (check.checkAdjacency(asal, tujuan)) {
            System.out.println(adjacencyMessage(asal, tujuan) + " bertetangga");
        } else {
            System.out.println(adjacencyMessage(asal, tujuan) + " tidak bertetangga");
        }
    }

    static String adjacencyMessage(int asal, int tujuan) {
        return "Gedung " + (char) ('A' + asal) + " dan " + "Gedung " + (char) ('A' + tujuan);
    }
}
