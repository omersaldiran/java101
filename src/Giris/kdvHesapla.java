package Giris;

import java.util.Scanner;

public class kdvHesapla {
    public static void main(String[] args) {
        double netTutar;
        System.out.println("Tutarı giriniz : ");
        Scanner input = new Scanner(System.in);
        int tutar = input.nextInt();
        if(tutar>1000){
            netTutar = tutar*1.08;
        }
        else{
            netTutar = tutar*1.18;
        }
        System.out.println("KDV'li net tutar : " + netTutar);
    }

}
