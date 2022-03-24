package matematiksel_islemler;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi alip
        // rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("dort basamaklı sayi gir");
        int sayi=scan.nextInt();
        int rakamlarToplami=0;

        int rakam=sayi%10;

        rakamlarToplami+=rakam;

        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi/=10;
        rakamlarToplami+=sayi;

        System.out.println("rakamlar toplami "+rakamlarToplami);

    }
}
