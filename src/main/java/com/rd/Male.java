package com.rd;

public class Male extends Employee {
    public Male(String ad, String soyad, int dogumYili) {
        super(ad, soyad, dogumYili);
    }

    @Override
    public void emeklilikYasiniHesapla(int mevcutYil) {
        int emeklilikYasi = 65;
        int yas = getYas(mevcutYil);
        int kalanYil = emeklilikYasi - yas;
        if (kalanYil > 0) {
            System.out.println(getAd() + " Bey'in emeklilik icin calismasi gereken sure " + kalanYil + " yildir");
        } else {
            System.out.println(getAd() + " zaten emekli.");
        }
    }
}





