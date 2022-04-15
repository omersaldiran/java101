package Giris;

import java.util.Scanner;

public class BiletFiyatHesapla {
    public static void main(String[] args) {
        int mesafe, yas, yolcuTipi;
        double kmUcreti = 0.1;
        double ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gitmek istediğiniz mesafeyi KM cinsinden giriniz : ");
        mesafe = input.nextInt();
        System.out.println("Lütfen yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Lütfen yolcu tipini seçiniz :");
        System.out.println("1- Tek Yön");
        System.out.println("2- Gidiş - Dönüş");
        yolcuTipi = input.nextInt();

        if (mesafe<0 || yas<0 || yolcuTipi>2 || yolcuTipi<1)
            System.out.println("Hatalı Veri Girdiniz!");
        else{
            ucret = mesafe*kmUcreti;
            if(yas<12){
                ucret = ucret*0.5;
            }
            else if(yas>12 && yas<24){
                ucret = ucret*0.9;
            }
            else if(yas>65){
                ucret = ucret*0.7;
            }
            if(yolcuTipi==2){
                ucret=ucret*0.8;
            }
            System.out.println("Toplam Tutar = " + ucret + " TL");
        }
    }
}
