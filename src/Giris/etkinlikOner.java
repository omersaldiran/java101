package Giris;

import java.util.Scanner;

public class etkinlikOner {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(sicaklik>=5 && sicaklik <15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(sicaklik>=15 && sicaklik <25){
            System.out.println("Pinkiğe gidebilirsiniz");
        }
        else {
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}
