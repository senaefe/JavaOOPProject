package com.rd;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String ad;
    private TeamLeader takimLideri;
    private List<Employee> personelListesi;
    private List<String> gorevListesi;

    public Department(String ad, TeamLeader takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
    }

    public void takimLideriDegistir(TeamLeader yeniTakimLideri) {
        this.takimLideri = yeniTakimLideri;
    }

    public void personelEkle(Employee personel) {
        personelListesi.add(personel);
    }

    public void personelCikar(Employee personel) {
        personelListesi.remove(personel);
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
    }

    public void goreviTamamla(String gorev) {
        if (gorevListesi.contains(gorev)) {
            gorevListesi.remove(gorev);
            System.out.println(gorev + " görevi tamamlandı.");
        } else {
            System.out.println(gorev + " görevi bulunamadı.");
        }
    }

    public void departmanBilgileriniListele() {
        System.out.println("Departman: " + ad);
        System.out.println("Takim Lideri: " + takimLideri.getAd() + " " + takimLideri.getSoyad());
        System.out.println("Personel Listesi:");
        for (Employee personel : personelListesi) {
            System.out.println("- " + personel.getAd() + " " + personel.getSoyad());
        }
        System.out.println("Gorev Listesi:");
        for (String gorev : gorevListesi) {
            System.out.println("* " + gorev);
        }
    }
}


