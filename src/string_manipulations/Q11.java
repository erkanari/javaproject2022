package string_manipulations;

import java.util.Locale;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // 	Soru 2) Kullanicidan bir cumle isteyin.
        // Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        // iki kelimeyi de iceriyorsa "kucuk mu buyuk mu karar ver"

        Scanner scan=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle=scan.nextLine().toLowerCase();

        if (cumle.contains("buyuk") && (cumle.contains("kucuk"))){
            System.out.println("buyuk mu kucuk mu karar ver");
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("iki kelimeyi de icermiyor");
        }


    }
}
