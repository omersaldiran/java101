package Giris;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2;
        double sonuc;
        int secim;
        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        secim = input.nextInt();
        System.out.println("Seçim : " + secim);
        switch (secim){
            case 1:
                System.out.println("Toplanacak sayıları giriniz : ");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç : " + sonuc);
                break;
            case 2:
                System.out.println("Çıkarılacak sayıları giriniz : ");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç : " + sonuc);
                break;
            case 3:
                System.out.println("Bölünecek sayıları giriniz : ");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1 / sayi2;
                System.out.println("Sonuç : " + sonuc);
                break;
            case 4:
                System.out.println("Çarpılacak sayıları giriniz : ");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç : " + sonuc);
                break;
        }
    }
}
