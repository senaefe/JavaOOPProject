package com.rd;

public class Female extends Employee {
    public Female(String ad, String soyad, int dogumYili) {
        super(ad, soyad, dogumYili);
    }

    @Override
    public void emeklilikYasiniHesapla(int mevcutYil) {
        int emeklilikYasi = 60;
        int yas = getYas(mevcutYil);
        int kalanYil = emeklilikYasi - yas;
        if (kalanYil > 0) {
            System.out.println(getAd() + " Hanim'in emeklilik icin calismasi gereken sure " + kalanYil + " yildir");
        } else {
            System.out.println(getAd() + " zaten emekli.");
        }
    }
}


