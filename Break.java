package com.Solikhul.pbo.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0;
        while(p <= 100) {
            System.out.println("Perulangan ke-" + p);
            if (p == 50) {
                System.out.println("Capek boll !");
                break;
            }
            p += 10;
        }
    }
}
