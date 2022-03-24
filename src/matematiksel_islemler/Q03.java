package matematiksel_islemler;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // kullanicidan 3 basamakli bir sayi alip
        // rakamlar toplamini yazdiran
        // bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("üc basamaklı sayı girin");
        int sayi=scan.nextInt();

        int rakamlarToplami=0;

        int rakam=sayi%10;

        rakamlarToplami+=rakam;

        sayi/=10;

        rakam=sayi%10;

        rakamlarToplami+=rakam;

        sayi/=10;

        rakamlarToplami+=sayi;

        System.out.println("rakamlar toplami "+rakamlarToplami);



    }
}
