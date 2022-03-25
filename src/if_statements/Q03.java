package if_statements;

import java.util.Locale;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        	/*
		 * Soru 3) Kullanicidan gun ismini alin ve
		 * haftaici veya hafta sonu oldugunu yazdirin
 			Ornek:  	gun=Pazar output = “Hafta sonu”
						gun=Sali output = “Hafta ici”
		 *** String icin equals method’unu kullanin

		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("gün girin");
        String gun=scan.next().toLowerCase();

        if (gun.equals("cumartesi") || (gun.equals("pazar"))){
            System.out.println("hafta sonu");
        }
        if (gun.equals("pazartesi") || (gun.equals("sali")) || (gun.equals("carsamba"))
                || (gun.equals("persembe")) || (gun.equals("cuma"))){
            System.out.println("hafta ici");
        }

    }
}
