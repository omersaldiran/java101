package Giris;

import java.util.Scanner;

public class loginEkrani {
    public static void main(String[] args) {
        String userName,password,newPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("omersaldiran")&&password.equals("123")) {
            System.out.println("Başarıyla giriş yaptınız");
        }
        else if(password!="123"){
                System.out.println("Şifreniz hatalı, sıfırlamak ister misiniz ? ");
                String durum;
                System.out.println("E/H");
                durum = input.nextLine();
                if (durum.equals("E")){
                    System.out.println("Lütfen yeni şifrenizi girin : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre oluşturuldu");
                        password=newPassword;
                    }
                }
                else{
                    System.out.println("Şifre değiştirilmedi.");
                }
            }

    }
}
