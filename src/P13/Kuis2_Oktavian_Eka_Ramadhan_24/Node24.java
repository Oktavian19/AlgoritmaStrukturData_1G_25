package P13.Kuis2_Oktavian_Eka_Ramadhan_24;

public class Node24 {
    Pembeli24 pembeli24;
    Pesanan24 pesanan24;
    Node24 prev24, next24;

    Node24(Node24 prev24, Pembeli24 pembeli24, Node24 next24) {
        this.prev24 = prev24;
        this.pembeli24 = pembeli24;
        this.next24 = next24;
    }

    Node24(Node24 prev24, Pesanan24 pesanan24, Node24 next24) {
        this.prev24 = prev24;
        this.pesanan24 = pesanan24;
        this.next24 = next24;
    }
}
