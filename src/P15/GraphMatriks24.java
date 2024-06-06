package P15;

public class GraphMatriks24 {
    int vertex;
    int[][] matriks;

    GraphMatriks24(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        // inDegree
        for (int i = 0; i < matriks[asal].length; i++) {
            if (matriks[asal][i] != 0) {
                totalIn++;
            }
        }
        // outDegree
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                totalOut++;
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
}
