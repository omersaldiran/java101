package Giris;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen km bilgisi giriniz : ");
        km = input.nextInt();

        tutar = 10 + km*2.2;
        if(tutar<20)
            tutar = 20;
        System.out.println("Ödenecek miktar : " + tutar);
    }
}
