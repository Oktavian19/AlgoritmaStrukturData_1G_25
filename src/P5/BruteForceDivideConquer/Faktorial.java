package P5.BruteForceDivideConquer;

public class Faktorial {
    int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktoralDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktoralDC(n - 1);
            return fakto;
        }
    }
}
