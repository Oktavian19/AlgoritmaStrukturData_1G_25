package P8.UTS_Okta;

public class nasabahOkta {
    String norekOkta, namaOkta, nikOkta;
    int umurOkta;
    double saldoOkta;

    nasabahOkta(String noOkta, String nmOkta, String nikOkta, int umurOkta, double sdoOkta) {
        norekOkta = noOkta;
        namaOkta = nmOkta;
        this.nikOkta = nikOkta;
        this.umurOkta = umurOkta;
        saldoOkta = sdoOkta;
    }

    void tampilOkta() {
        System.out.println("No. Rekening : " + norekOkta);
        System.out.println("Nama : " + namaOkta);
        System.out.println("NIK : " + nikOkta);
        System.out.println("Umur : " + umurOkta);
        System.out.println("Saldo : " + saldoOkta);
    }
}
