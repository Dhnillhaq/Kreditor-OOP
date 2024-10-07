package core;

public class Angsuran {

    //    Properti / Atribut
    private int angsuranKe;
    private double jumlahBayar;
    private double sisaPinjaman;

//    Constructor -> Proses yang dijalankan secara otomatis
//    ketika suatu classs di-instansiasi
    public Angsuran(int angsuranKe, double jumlahBayar, double sisaPinjaman){
//        Pindahkan nilai dari parameter ke properti masing masing.
        this.angsuranKe = angsuranKe;
        this.jumlahBayar = jumlahBayar;
        this.sisaPinjaman = sisaPinjaman;
    }

    public String[] getStrProperty(){
        String[] strProperty = new String[3];
                strProperty[0] = Integer.toString(this.angsuranKe);
                strProperty[1] = Double.toString(this.jumlahBayar);
                strProperty[2] = Double.toString(this.sisaPinjaman);
        return strProperty;
    }
}
