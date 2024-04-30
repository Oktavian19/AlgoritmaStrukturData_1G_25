package P7.TestSearching;

public class PencarianBuku24 {
    Buku24 listBk[] = new Buku24[5];
    int idx;

    void tambah(Buku24 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku24 m : listBk) {
            m.tampilDataBuku();
        }
    }

    int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku) == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    String findSeqSearchString(String cari) {
        String hasil = "Data tidak ditemukan";
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                hasil = "Data ditemukan pada index " + j;
                break;
            }
        }
        return hasil;
    }

    int findSeqTitle(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equals(cari)) {
                posisi = i;
            }
        }
        return posisi;
    }

    int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == Integer.parseInt(listBk[mid].kodeBuku)) {
                return mid;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    String findBinarySearchString(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return "Data ditemukan pada index " + mid;
            } else if (listBk[mid].kodeBuku.compareTo(cari) < 0) {
                return findBinarySearchString(cari, left, mid - 1);
            } else {
                return findBinarySearchString(cari, mid + 1, right);
            }
        }
        return "Data tidak ditemukan";
    }

    int findBinaryTitle(String cari, int left, int right) {
        Buku24[] books = sortbyTitle();
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(books[mid].judulBuku)) {
                return findBinarySearch(Integer.parseInt(books[mid].kodeBuku), 0, books.length - 1);
            } else if (books[mid].judulBuku.compareTo(cari) < 0) {
                return findBinaryTitle(cari, left, mid - 1);
            } else {
                return findBinaryTitle(cari, mid + 1, right);
            }
        }
        return -1;
    }

    Buku24[] sortbyTitle() {
        Buku24[] books = listBk;
        for (int i = 0; i < books.length; i++) {
            int min = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].judulBuku.compareTo(books[min].judulBuku) < 0) {
                    min = j;
                }
            }
            Buku24 tmp = books[min];
            books[min] = books[i];
            books[i] = tmp;
        }
        return books;
    }

    Buku24 FindBuku(int cari) {
        return listBk[findSeqSearch(cari)];
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.printf("\nData %d ditemukan pada indeks %d\n", x, pos);
        } else {
            System.out.printf("\nData %d tidak ditemukan\n", x);
        }
    }

    void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + x);
            System.out.println("Judul buku \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBk[pos].pengarang);
            System.out.println("Stock \t\t: " + listBk[pos].stock);
        } else {
            System.out.printf("Data %d tidak ditemukan\n", x);
        }
    }

    boolean IsContainWord(String cari, int index) {
        for (int i = 0; i < listBk[index].judulBuku.length() - cari.length(); i++) {
            if (cari.regionMatches(true, i, cari, 0, cari.length())) {
                return true;
            }
        }
        return false;
    }
}
