package Giris;

import java.util.List;
import java.util.Scanner;

public class ortalamaHesapla {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik,toplam,bolum;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        toplam = 0;
        bolum=0;

        if(mat<=100 && mat>=0){
            toplam+=mat;
            bolum++;
        }
        if(fizik<=100 && fizik>=0){
            toplam+=fizik;
            bolum++;
        }
        if(kimya<=100 && kimya>=0){
            toplam+=kimya;
            bolum++;
        }
        if(turkce<=100 && turkce>=0){
            toplam+=turkce;
            bolum++;
        }
        if(muzik<=100 && muzik>=0){
            toplam+=muzik;
            bolum++;
        }
        if (bolum>0){
            ortalama = toplam / bolum;
            System.out.println("Ortalama not : " + ortalama);
            if (ortalama>=55){
                System.out.println("Geçtiniz !");
            }
            else {
                System.out.println("Kaldınız !");
            }
        }
    }
}
