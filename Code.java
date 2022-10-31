import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        
        try (Scanner inp = new Scanner(System.in)) {
            String userName,password,karar,kullaniciAdi,sifre;
            kullaniciAdi="patika";
            sifre="JAVA101";

            System.out.print("User Name : ");
            userName=inp.nextLine();
            System.out.print("Password : ");
            password=inp.nextLine();
            
            if(userName.equals(kullaniciAdi)){
                if(password.equals(sifre)){
                    System.out.println("Giris Basarili");}
                    else{
                        System.out.println("Password Hatali!");}
                }else{
                    System.out.println("Hatali User Name!");}
            if(userName!="patika"||password!="JAVA101"){
                System.out.print("User Name ve Password degistirmek ister misiniz? (Y/N) : ");
                karar=inp.nextLine();
                if(karar.equals("Y")){
                    System.out.print("New User Name : ");
                    kullaniciAdi=inp.nextLine();
                    System.out.print("New Password : ");
                    sifre=inp.nextLine();if(kullaniciAdi.equals("patika")||sifre.equals("JAVA101")){
                        System.out.println("Kullanici adi ve sifre olusturulamadi!");}else{
                        System.out.println("islem basarili");}}else{
                                System.out.println("Tekrar Deneyiniz.");}}
            
                    }
        
    }

    }
