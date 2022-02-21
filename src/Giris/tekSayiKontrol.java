package Giris;

import java.util.Scanner;

public class tekSayiKontrol {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);

        System.out.println("Çift ve 4'e bölünebilen sayıların toplamı : " + toplam);

    }
}
