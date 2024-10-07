package core;

public class Pinjaman {
    private double hutang;
    private float bunga;
    private int jmlhCicilan;

    // Atribut yang dicari / dihitung
    private Angsuran[] daftarAngsuran;

    public Pinjaman(double hutang, float bunga, int jmlhCicilan) {
        this.hutang = hutang;
        this.bunga = bunga;
        this.jmlhCicilan = jmlhCicilan;

        // Inisialisasi panjang array Daftar Angsuran
        this.daftarAngsuran = new Angsuran[this.jmlhCicilan];
    }

    public void hitung() {
        double totalBunga = this.hutang * this.bunga / 100;
        double bayarBrp = (this.hutang + totalBunga) / this.jmlhCicilan;
        double totalBayar = 0;
        double sisaBayar = 0;
        for (int i = 0; i < this.jmlhCicilan; i++) {
            totalBayar = (this.hutang + totalBunga);
            sisaBayar = totalBayar - (bayarBrp * (i + 1));
            daftarAngsuran[i] = new Angsuran(i + 1, bayarBrp, sisaBayar);
        }
        System.out.println("Jumlah Hutang\t= " + this.hutang);
        System.out.println("Bunga\t\t= " + this.bunga + "%");
        System.out.println("Jmlh angsuran\t= " + this.jmlhCicilan);
        System.out.println("\n+--------------------------------+\n");
        System.out.println("Yang harus dibayar: " + totalBayar);

    }

    // Getter untuk daftar angsuran, agar dia bisa
    // dipanggil oleh kelas lain yang membutuhkan

    public Angsuran[] getDaftarAngsuran() {
        return this.daftarAngsuran;
    }
}
