package Giris;

import java.util.Scanner;

public class hipotenusHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin dik kenarlarını girerek hipotenüsü hesaplatın");
        System.out.println("İlk kenarı girin : ");
        int dik1 = input.nextInt();
        System.out.println("İkinci kenarı girin : ");
        int dik2 = input.nextInt();
        double hipotenus = Math.sqrt((dik1*dik1) + (dik2*dik2));
        System.out.println("Hipotenüs uzunluğu : " + hipotenus);
        double cevre = dik1 + dik2 + hipotenus;
        double u = cevre/2;
        double alanKare = u*(u-dik1)*(u-dik2)*(u-hipotenus);
        double alan = Math.sqrt(alanKare);
        System.out.println("Üçgenin alanı : " + alan);

    }
}
