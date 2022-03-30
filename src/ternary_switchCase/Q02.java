package ternary_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        // Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi1=scan.nextInt();


        System.out.println( sayi1%2==0 ? "cift"  : "tek");

    }
}
