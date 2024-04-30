package P8.UTS_Okta;

public class searchingOkta {
    sortingOkta nbOkta = new sortingOkta();
    nasabahOkta[] dataNbOkta = this.nbOkta.nbOkta;

    int searchOkta(String nmOkta, int left, int right) {
        nasabahOkta[] nbSortOkta = nbOkta.sortOkta();
        int midOkta;
        if (right >= left) {
            midOkta = (right + left) / 2;
            if (nmOkta.equals(nbSortOkta[midOkta].namaOkta)) {
                return midOkta;
            } 
            else if(nbSortOkta[midOkta].namaOkta.compareTo(nmOkta) > 0)  {
                return searchOkta(nmOkta, left, midOkta - 1);
            } else {
                return searchOkta(nmOkta, midOkta + 1, right);
            }
        }
        return -1;
    }

    int searchOktaSeq(String nmOkta) {
        int posisiOkta = -1;
        for (int j = 0; j < dataNbOkta.length; j++) {
            if (dataNbOkta[j].namaOkta.equals(nmOkta)) {
                posisiOkta = j;
                break;
            }
        }
        return posisiOkta;
    }
}
