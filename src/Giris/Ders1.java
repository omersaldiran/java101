package Giris;

import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args) {
        System.out.print("Ortalama Hesaplama Programı\n");

        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Fizik notunuzu girin : ");
        Fizik = input.nextInt();

        System.out.println("Kimya notunuzu girin : ");
        Kimya = input.nextInt();

        System.out.println("Turkce notunuzu girin : ");
        Turkce = input.nextInt();

        System.out.println("Tarih notunuzu girin : ");
        Tarih = input.nextInt();

        System.out.println("Muzik notunuzu girin : ");
        Muzik = input.nextInt();

        System.out.println("Metamatik notunuzu girin : ");
        Matematik = input.nextInt();

        double ortalama = (Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6.0;
        System.out.println("Ortalamanız : " + ortalama);
        String durum = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
