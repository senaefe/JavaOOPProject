package com.rd;

public class Employee {
    private String ad;
    private String soyad;
    private int dogumYili;

    public Employee(String ad, String soyad, int dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYili = dogumYili;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public int getYas(int mevcutYil) {
        return mevcutYil - dogumYili;
    }

    public void emeklilikYasiniHesapla(int mevcutYil) {
    }
}
