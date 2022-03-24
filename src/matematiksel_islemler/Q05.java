package matematiksel_islemler;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // kullanicidan 6 basamakli bir sayi alin
        // ve rakamlar toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("altı basamaklı sayı gir");
        int sayi=scan.nextInt();
        int toplam=0;

        int rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        toplam+=sayi;

        System.out.println("toplam "+toplam);




    }
}
