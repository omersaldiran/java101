package Giris;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class daireAlanHesapla {
    public static void main(String[] args) {
            int r;
            double alan;
            double cevre;
            int alfa;
            double pi = 3.14;
            double dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.printf("Lütfen yarıçap değerini giriniz : ");
        r = input.nextInt();
        System.out.printf("Lütfen alfa açısını giriniz : ");
        alfa = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;
        dilimAlan = (pi*(r*r)*alfa)/360;

        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Daire alanı : " + alan);
        System.out.println("Verilen açıya göre dilim alanı : " + dilimAlan);

    }
}
