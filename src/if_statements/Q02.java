package if_statements;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi girin");

        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%2==1){
            System.out.println("sayi tek");
        }

    }
}
