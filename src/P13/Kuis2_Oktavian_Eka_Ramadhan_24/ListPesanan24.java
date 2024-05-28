package P13.Kuis2_Oktavian_Eka_Ramadhan_24;

public class ListPesanan24 {
    Node24 head24;
    int size24;

    ListPesanan24() {
        head24 = null;
        size24 = 0;
    }

    boolean isEmpty() {
        return head24 == null;
    }

    void addFirst(Pesanan24 item24) {
        if (isEmpty()) {
            head24 = new Node24(null, item24, null);
        } else {
            Node24 newNode24 = new Node24(null, item24, head24);
            head24.prev24 = newNode24;
            head24 = newNode24;
        }
        size24++;
    }

    void addLast(Pesanan24 item24) {
        if (isEmpty()) {
            addFirst(item24);
        } else {
            Node24 current = head24;
            while (current.next24 != null) {
                current = current.next24;
            }
            Node24 newNode24 = new Node24(current, item24, null);
            current.next24 = newNode24;
            size24++;
        }
    }

    void add(Pesanan24 item24, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item24);
        } else if (index < 0 || index > size24) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node24 current = head24;
            int i = 0;
            while (i < index) {
                current = current.next24;
                i++;
            }
            if (current.prev24 == null) {
                addFirst(item24);
            } else {
                Node24 newNode24 = new Node24(current.prev24, item24, current);
                current.prev24.next24 = newNode24;
                current.prev24 = newNode24;
            }
        }
        size24++;
    }

    int size24() {
        return size24;
    }

    void clear() {
        head24 = null;
        size24 = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node24 tmp = head24;
            while (tmp != null) {
                System.out.print(tmp.pesanan24.kodePesanan24 + "\t" + tmp.pesanan24.namaPesanan24 + "\t" + tmp.pesanan24.harga24 + "\n");
                tmp = tmp.next24;
            }
            //System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size24 == 1) {
            removeLast();
        } else {
            head24 = head24.next24;
            head24.prev24 = null;
            size24--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head24.next24 == null) {
            head24 = null;
            size24--;
            return;
        }
        Node24 current = head24;
        while (current.next24.next24 != null) {
            current = current.next24;
        }
        current.next24 = null;
        size24--;
    }

    void remove(int index) throws Exception {
        if (isEmpty() || index >= size24) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node24 current = head24;
            int i = 0;
            while (i < index) {
                current = current.next24;
                i++;
            }
            if (current.next24 == null) {
                current.prev24.next24 = null;
            } else if (current.prev24 == null) {
                current = current.next24;
                current.prev24 = null;
                head24 = current;
            } else {
                current.prev24.next24 = current.next24;
                current.next24.prev24 = current.prev24;
            }
            size24--;
        }
    }

    Pesanan24 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head24.pesanan24;
    }

    Pesanan24 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node24 tmp = head24;
        while (tmp.next24 != null) {
            tmp = tmp.next24;
        }
        return tmp.pesanan24;
    }

    int getHarga(int index) throws Exception {
        if (isEmpty() || index >= size24) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head24;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next24;
        }
        return tmp.pesanan24.harga24;
    }

    String getNama(int index) throws Exception {
        if (isEmpty() || index >= size24) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head24;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next24;
        }
        return tmp.pesanan24.namaPesanan24;
    }

    Pesanan24 get(int index) throws Exception {
        if (isEmpty() || index >= size24) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head24;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next24;
        }
        return tmp.pesanan24;
    }
}
