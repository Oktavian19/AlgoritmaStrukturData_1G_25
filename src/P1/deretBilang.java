package P1;

public class deretBilang {
    public static void main(String[] args) {
        String NIM = "2341720117";
        String digit = String.format("%s%s", NIM.charAt(NIM.length() - 2), NIM.charAt(NIM.length() -  1));
        int key = Integer.parseInt(digit);

        System.out.println("n : " + key);
        for (int i = 1; i < key; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.printf(" *");
            }
            else if (i % 2 != 1) {
                System.out.printf(" %d", i);
            }
        }
    }
}
