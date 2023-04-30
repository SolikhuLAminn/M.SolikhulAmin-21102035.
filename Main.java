package com.Solikhul.pbo.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();

        manajer.nip = 21102035;
        manajer.nama = "M.Solikhul Amin";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(5000000);
    }
}
