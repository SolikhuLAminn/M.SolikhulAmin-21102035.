package com.Solikhul.pbo.pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Masukkan Nama anda :");
        String nama = scanner.nextLine();
        System.out.println("Selamat Sore " + nama);

    }
}
