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
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return 0;
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
}
