package com.Solikhul.pbo.pertemuan3.unguided2;

public class Main_buku {
    public static void main(String[] args) {

        Buku sidu = new Buku();
        Buku bigbos = new Buku();

        sidu.no_buku = 1;
        sidu.judul_buku = "Pemograman Berbasis Objek dengan Java";
        sidu.pengarang = "Indrajani";
        sidu.tahun_terbit = 2007;
        sidu.harga = 70000;

        bigbos.no_buku = 2;
        bigbos.judul_buku = "Dasar pemograman Java";
        bigbos.pengarang = "Abdul Kadir";
        bigbos.tahun_terbit = 2004;
        bigbos.harga = 30000;

        sidu.showInfo();
        bigbos.showInfo();


    }
}
