package com.Solikhul.pbo.pertemuan2;

import java.util.Scanner;

public class PendaftaranMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String Nama = input.nextLine();

        System.out.print("Masukkan Umur : ");
        int Umur = input.nextInt();

        if (Umur < 17){
            System.out.println("Umur anda belum cukup");
        }

        System.out.println ("Pilih Jurusan : ");
        System.out.println("1.Teknik Informatika");
        System.out.println("2.Sistem Informasi");
        System.out.println("3.Rekayasa perangkat Lunak");
        String Jurusan = input.nextLine();

        System.out.print("Masukkan Pilihan : ");
        int Pilihan = input.nextInt();

        System.out.println("Nama : "+Nama);
        System.out.println("Umur : "+Umur);
        System.out.print("Jurusan : ");

        if (Pilihan > 2) {
            System.out.println(Pilihan +".Rekayasa Perangkat Lunak");
        } else if (Pilihan < 2){
            System.out.println(Pilihan +".Teknik Informatika");
        } else {
            System.out.println(Pilihan +".Sistem Informasi");
        }
    }
}
