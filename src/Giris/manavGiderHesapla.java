package Giris;

import java.util.Scanner;

public class manavGiderHesapla {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlıcan,toplam;
        Scanner input = new Scanner(System.in);
        System.out.printf("Armut kaç kilo : ");
        armut = input.nextInt();
        armut *= 2.14;
        System.out.printf("Elma kaç kilo : ");
        elma = input.nextInt();
        elma *= 3.67;
        System.out.printf("Domates kaç kilo : ");
        domates = input.nextInt();
        domates *= 1.11;
        System.out.printf("Muz kaç kilo : ");
        muz = input.nextInt();
        muz *= 0.95;
        System.out.printf("Patlıcan kaç kilo : ");
        patlıcan = input.nextInt();
        patlıcan *= 5;
        toplam = armut+elma+domates+muz+patlıcan;
        System.out.printf("Toplam Tutar : " + toplam + "TL");
    }
}
