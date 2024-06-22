package com.rd;

public class Main {
    public static void main(String[] args) {
        TeamLeader takimLideri = new TeamLeader("Sena", "Efe", 1995);
        Department department = new Department("IT", takimLideri);

        Female kadin1 = new Female("Emine", "Yetismis", 1967);
        Male erkek1 = new Male("Bora", "Ates", 1978);

        department.personelEkle(kadin1);
        department.personelEkle(erkek1);

        department.gorevEkle("IK Daily Toplantisi");
        department.gorevEkle("IK Is Gorusmesi");

        department.departmanBilgileriniListele();

        department.goreviTamamla("IK Daily Toplantisi");

        kadin1.emeklilikYasiniHesapla(2024);
        erkek1.emeklilikYasiniHesapla(2024);

        System.out.println("//////////////////////////");

        TeamLeader takimLideri2 = new TeamLeader("Ozan", "Kose", 1991);
        Department department2 = new Department("Software", takimLideri2);

        Female kadin2 = new Female("Tugba", "Uzun", 1965);
        Male erkek2 = new Male("Melih", "Hat", 1999);

        department2.personelEkle(kadin2);
        department2.personelEkle(erkek2);

        department2.gorevEkle("Gunluk kod yazma");
        department2.gorevEkle("Yazilan kodu analist ve test ekibi ile degerlendirme");

        department2.departmanBilgileriniListele();

        department2.goreviTamamla("IK Daily Toplantisi");

        kadin2.emeklilikYasiniHesapla(2024);
        erkek2.emeklilikYasiniHesapla(2024);

    }
}




