package com.Solikhul.pbo.pertemuan2;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int bilangan = input.nextInt();

        for (int i = 2; i <= 20; i += 2) {
            System.out.println( "bilangan genap :" + i );
        }
    }
}