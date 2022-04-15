package Giris;

import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğdunuz ayı sayıyla giriniz : ");
        month = input.nextInt();

        System.out.println("Ayın hangi gününde doğduğunuzu giriniz : ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day<22){
                    System.out.println("Oğlak burcu");
                }
                else {
                    System.out.println("Kova burcu");
                }
                break;

            case 2:
                if(day<19){
                    System.out.println("Kova burcu");
                }
                else {
                    System.out.println("Balık burcu");
                }
                break;

            case 3:
                if(day<21){
                    System.out.println("Balık burcu");
                }
                else {
                    System.out.println("Koç burcu");
                }
                break;

            default:
                System.out.println("Hatalı bir giriş yaptınız.");
        }
    }
}
