package scanner;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner scan=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        double sayi1= scan.nextDouble();

        System.out.println("ikinci sayiyi giriniz");

        double sayi2= scan.nextDouble();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1/sayi2);
        System.out.println(sayi1*sayi2);

    }
}
