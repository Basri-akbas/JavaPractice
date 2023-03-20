package java_;

import java.util.Scanner;

public class F0047 {

    public static void main(String[] args) {
        //girilecek email adresinin kurallara uygun olup olmadigini kontrol edelim
        //on isim @sonisim.
        //bosluk karakteri olmayacak
        //getEmailDogrulama(String email)  return type =>boolean

        Scanner scan =new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email=scan.next();
        System.out.println(getEmailDogrulama(email));


        scan.close();
    }
    public static boolean getEmailDogrulama (String email) {
        if (!email.contains("@")) {
            return false;
        }if (email.length()<=4) {
            return false;
        }if (email.contains(" ")) {
            return false;
        }if (!email.contains(".")) {
            return false;
        }
        String arr[]=email.split("@");
        //abc@c@.com  arr[0]="abc"  arr[1]="c" arr[2]=.com
        if(arr[0].length()<1) {
            return false;
        }if (arr[1].length()<3) {
            return false;
        }if(arr.length>2) {
            return false;
        }
        return true;
    }
}
