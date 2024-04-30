package P9;

public class Gudang24 {
    Barang24[] tumpukan;
    int size;
    int top;

    Gudang24(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang24[size];
        top = -1;
    }

    boolean cekKosong() {
        return top == -1;
    }

    boolean cekPenuh() {
        return top == size - 1;
    }

    void tambahBarang(Barang24 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    Barang24 ambilBarang24() {
        if (!cekKosong()) {
            Barang24 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    Barang24 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang24 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");

            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}
