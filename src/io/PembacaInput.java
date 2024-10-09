package io;
import core.Pinjaman;

public class PembacaInput {
    
    private String[] args;

//    Atribut utama yang dicari
    private Pinjaman pinjaman;

    public PembacaInput(String[] args){
        this.args = args;
    }

//    Method untuk mengolah args menjadi objek Pinjaman yang siap digunakan
    public void baca(){
//        Membaca input dari console
//        3 Parameter : Hutang, Bunga, Jumlah Ansuran
        double hutang = 0;// Double.parseDouble(args[0]);
        float bunga = 0;// Float.parseFloat(args[1]);
        int jmlhCicilan = 0; //Integer.parseInt(args[2]);

        for (int i = 0; i < args.length; i++) {
            String[] split = args[i].split("=");
            switch (split[0]) {
                case "-h":
                    hutang = Double.parseDouble(split[1]);
                    break;
                case "-b":
                    bunga = Float.parseFloat(split[1]);
                    break;
                default:
                    jmlhCicilan = Integer.parseInt(split[1]);
                    break;
            }
        }
    this.pinjaman = new Pinjaman(hutang, bunga, jmlhCicilan);
    }
//    Getter Pinjaman

    public Pinjaman getPinjaman() {
        return pinjaman;
    }
}