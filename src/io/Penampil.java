package io;
import core.Angsuran;

public class Penampil {
    Angsuran[] daftarAngsuran;

    public Penampil(Angsuran[] daftarAngsuran) {
        this.daftarAngsuran = daftarAngsuran;
    }



    public void gambarHeaderTabel() {
        System.out.println("+--------------------------------------------+");
        System.out.println("| Angsuran ke- | Total Bayar  |     Sisa     |");
        System.out.println("+--------------------------------------------+");
    }

    public void gambarBodyTabel() {
        for (int i = 0; i < daftarAngsuran.length; i++) {
            String[] dataAngsuran = daftarAngsuran[i].getStrProperty();
            String angsuranKe = dataAngsuran[0];
            String totalBayar = dataAngsuran[1];
            String sisa = dataAngsuran[2];
            System.out.println("|" + formatSpace(angsuranKe.length()) + angsuranKe + "|" + formatSpace(totalBayar.length()) + totalBayar + "|" + formatSpace(sisa.length()) + sisa + "|");
            System.out.println("+--------------------------------------------+");
        }

    }

    //    Method format pembuat spasi
    private String formatSpace(int pjgKarakter) {
        String spaceTambahan = "";
        for (int i = 0; i < 14 - pjgKarakter; i++) {
            spaceTambahan += " ";
        }
        return spaceTambahan;
    }
}
