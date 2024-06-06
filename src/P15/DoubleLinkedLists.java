package P15;

public class DoubleLinkedLists {
    Node24 head;
    int size;

    DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node24(null, item, jarak, null);
        } else {
            Node24 newNode = new Node24(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node24 newNode = new Node24(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                addFirst(item, jarak);
            } else {
                Node24 newNode = new Node24(current.prev, item, jarak, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node24 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index) throws Exception {
        Node24 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node24 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
