package com.Solikhul.pbo.pertemuan3.unguided1;

public class Koperasi {
    String nama_barang;
    int harga_barang;
    int jumlah_barang;
    int total_harga;


    public Koperasi(String nama_barang, int harga_barang, int jumlah_barang, int total_harga) {
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    public Koperasi(){}

    public String getNama_barang() { return nama_barang; }

    public void setNama_barang(String nama_barang) { this.nama_barang = nama_barang; }

    public int getHarga_barang() { return harga_barang; }

    public void setHarga_barang(int harga_barang) { this.harga_barang = harga_barang; }

    public int getJumlah_barang() { return jumlah_barang; }

    public void setJumlah_barang(int jumlah_barang) { this.jumlah_barang = jumlah_barang; }

    public int getTotal_harga() { return total_harga; }

    public void setTotal_harga(int total_harga) { this.total_harga = total_harga; }

    public void showInfo(){
        System.out.println("Nama_barang : "+nama_barang);
        System.out.println("Harga_barang : "+harga_barang);
        System.out.println("Jumlah_barang : "+jumlah_barang);
        System.out.println("Total_harga : "+total_harga);
    }
}
