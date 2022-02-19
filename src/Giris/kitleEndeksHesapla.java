package Giris;

import java.util.Scanner;

public class kitleEndeksHesapla {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double endeks;
        Scanner input = new Scanner(System.in);
        System.out.printf("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        System.out.printf("Lütfen boyunuzu giriniz : ");
        boy = input.nextDouble();
        endeks = kilo / boy * boy;
        System.out.printf("Vücut kitle endeksiniz : " + endeks);
    }
}
