package Giris;

import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı 1 'i giriniz: ");
        a = input.nextInt();

        System.out.println("Sayı 2 'yi giriniz: ");
        b = input.nextInt();

        System.out.println("Sayı 3 'ü giriniz: ");
        c = input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else{
                System.out.println("a>c>b");
            }
        }

        if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }
            else{
                System.out.println("b>c>a");
            }
        }

        if(c>a && c>b){
            if(b>a){
                System.out.println("c>b>a");
            }
            else{
                System.out.println("c>a>b");
            }
        }
    }
}
