package if_else_statement;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        //			eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
        //			Diger durumlarda ekrana  “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kenar uzunluğunu girin");
        int kenar1=scan.nextInt();
        System.out.println("bir kenar uzunluğunu girin");
        int kenar2=scan.nextInt();
        System.out.println("bir kenar uzunluğunu girin");
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 &&  kenar2==kenar3) {
            System.out.println("eşkenar");
        }else {
            System.out.println("eskenar değil");
        }
    }
}
