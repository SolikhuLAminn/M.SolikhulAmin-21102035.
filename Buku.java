package com.Solikhul.pbo.pertemuan3.unguided2;

public class Buku {

    int no_buku;

    String judul_buku;

    String pengarang;

    int tahun_terbit;

    int harga;

    public Buku(int no_buku, String judul_buku, String pengarang, int tahun_terbit, int harga) {
        this.no_buku = no_buku;
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
        this.harga = harga;
    }

    public Buku(){}

    public int getNo_buku(){ return no_buku; }

    public void setHarga(int no_buku) { this.no_buku = no_buku; }

    public String getJudul_buku(){ return judul_buku; }

    public void setjudul_buku(String judul_buku) { this.judul_buku = judul_buku; }

    public String getPengarang() {return pengarang; }

    public void setpengarang(String pengarang) {this.pengarang = pengarang; }

    public int getTahun_terbit() {return tahun_terbit; }

    public void settahun_terbit(int tahun_terbit) {this.tahun_terbit = tahun_terbit; }

    public int getHarga()  {return harga; }

    public void setharga(int harga) {this.harga = harga; }

    public void showInfo(){
        System.out.println("no_buku : "+no_buku);
        System.out.println("judul_buku :"+judul_buku);
        System.out.println("Pengarang :"+pengarang);
        System.out.println("tahun_terbit :"+tahun_terbit);
        System.out.println("harga :"+harga);
    }
}
