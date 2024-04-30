package P8.UTS_Okta;

public class sortingOkta {
    nasabahOkta[] nbOkta = new nasabahOkta[6];
    int idxOkta;

    void tambah(nasabahOkta nbOkta) {
        if (idxOkta < this.nbOkta.length) {
            this.nbOkta[idxOkta] = nbOkta;
            idxOkta++;
        } else {
            System.out.println("Data Penuh!");
        }
    }

    void tampilAll() {
        for (nasabahOkta nsbOkta : nbOkta) {
            nsbOkta.tampilOkta();
            System.out.println("---------------------");
        }
    }

    void tampilOkta(int idxOkta) {
        nbOkta[idxOkta].tampilOkta();
    }

    void sortUmurOkta() {
        for (int i = 0; i < nbOkta.length - 1; i++) {
            int MinOkta = i;
            for (int j = i + 1; j < nbOkta.length; j++) {
                if (nbOkta[j].umurOkta < nbOkta[MinOkta].umurOkta) {
                    MinOkta = j;
                }
            }
            nasabahOkta tmpOkta = nbOkta[MinOkta];
            nbOkta[MinOkta] = nbOkta[i];
            nbOkta[i] = tmpOkta;
        }
    }

    nasabahOkta[] sortOkta() {
        for (int i = 0; i < nbOkta.length - 1; i++) {
            int minOkta = i;
            for (int j = i + 1; j < nbOkta.length; j++) {
                if (nbOkta[i].namaOkta.compareTo(nbOkta[j].namaOkta) < 0) {
                    minOkta = j;
                }
            }
            nasabahOkta tmpOkta = nbOkta[minOkta];
            nbOkta[minOkta] = nbOkta[i];
            nbOkta[i] = tmpOkta; 
        }
        return nbOkta;
    }
}
