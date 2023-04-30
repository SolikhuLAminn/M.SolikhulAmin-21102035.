package com.Solikhul.pbo.pertemuan4.Unguided1;

public class Menu {

    int no_makanan;

    String nama_makanan;

    int harga;

    int stok;

    public Menu (int no_makanan, String nama_makanan, int harga, int stok) {
        this.no_makanan = no_makanan;
        this.nama_makanan = nama_makanan;
        this.harga = harga;
        this.stok = stok;
    }

    public Menu(){}

    public int getNo_makanan() { return no_makanan; }

    public void setNo_makanan(int no_makanan) {this.no_makanan = no_makanan; }

    public String getNama_makanan() { return nama_makanan; }

    public void setAlamat(String nama_makanan) {this.nama_makanan = nama_makanan; }

    public int getHarga() { return harga; }

    public void setHarga(int harga) {this.harga = harga; }

    public int getStok() { return stok; }

    public void setStok(int stok) {this.stok = stok; }

    public void showInfo() {
        System.out.println("No Makanan : " + no_makanan);
        System.out.println("Nama Makanan : " + nama_makanan);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : "+ stok);
    }
}
