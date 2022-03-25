package if_statements;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
		 * ve o harfle baslayan gun isimlerini yazdirin
			Ornek: 	ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
			ilkHarf=S output = “Sali”
		 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("gün ismi girin");
        char gun=scan.next().toUpperCase().charAt(0);

        if (gun=='P') {
            System.out.println("pazar, pazartesi,persembe");
        }
        if (gun=='S') {
            System.out.println("sali");
        }
        if (gun=='C') {
            System.out.println("cuma, cumartesi");
        }
        if (gun!='C' && gun!='P' && gun!='S') {
            System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
        }






    }
}
