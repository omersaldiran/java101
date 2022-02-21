package Giris;

import java.util.Scanner;

public class bolunebilme1 {
    public static void main(String[] args) {
        int sayi1,toplam = 0,i,ortalama,sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        sayi1 = input.nextInt();

        for(i=1;i<=sayi1;i++){
            if(i%3==0 && i%4==0){
                toplam = toplam + i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama : " + ortalama);
    }
}
