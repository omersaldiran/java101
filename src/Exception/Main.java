package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Yaşınızı giriniz : ");
        Scanner input = new Scanner(System.in);
        int yas = input.nextInt();
        checkAge(yas);
        System.out.println("Program bitti");
    }

    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("Yaşınız tutmuyor!");
        }
        System.out.println("Yaşı uygundur!");
    }

}
