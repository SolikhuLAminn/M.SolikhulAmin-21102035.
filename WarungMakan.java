package com.Solikhul.pbo.pertemuan4.Unguided1;

public class WarungMakan {

    String nama_warung;
    String alamat;
    String no_telepon;

    public WarungMakan( String nama_warung, String alamat, String no_telepon) {
        this.nama_warung = nama_warung;
        this.alamat = alamat;
        this.no_telepon = no_telepon;
    }

    public WarungMakan(){}

    public String getNama_warung() { return nama_warung; }

    public void setNama_warung(String nama_warung) {this.nama_warung = nama_warung; }

    public String getAlamat() { return alamat; }

    public void setAlamat(String alamat) {this.alamat = alamat; }

    public String getNo_telepon() { return no_telepon; }

    public void setNo_telepon(String no_telepon) {this.no_telepon = no_telepon; }


    public void showInfo() {
        System.out.println("Nama Warung : " + nama_warung);
        System.out.println("Alamat : " + alamat);
        System.out.println("No Telepon : " + no_telepon);
    }
}