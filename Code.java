import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        
        try (Scanner inp = new Scanner(System.in)) {
            String userName,Password,kullaniciAdi,sifre;
            kullaniciAdi="patika";
            sifre="JAVA101";
            boolean isUsernameSuccess=false;
            boolean isPasswordSuccess=false;

            while(!isUsernameSuccess){
                System.out.print("User Name : ");
                userName=inp.nextLine();
                if(userName.equals(kullaniciAdi)){
                        isUsernameSuccess=true;
                        while(!isPasswordSuccess){
                            System.out.print("Password : ");
                            Password=inp.nextLine();
                            if(Password.equals(sifre)){System.out.println("Giris Basarili!");isPasswordSuccess=true;}else{System.out.println("Password Hatali!\nTekrar Deneyiniz.\n");}}}
                    else{
                        System.out.println("User Name Hatali!\nTekrar Deneyiniz\n");}
                }
            }
    }
}
