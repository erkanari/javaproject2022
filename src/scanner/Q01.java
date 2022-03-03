package scanner;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
         * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
         */

        Scanner scan=new Scanner(System.in);

        String name, surname;
        int age, kilo;
        double boy;

        System.out.println("adınızı girin");
        name=scan.nextLine();

        System.out.println("soyadinizi girin");
        surname=scan.nextLine();

        System.out.println("yasinizi girin");
        age=scan.nextInt();

        System.out.println("kilonuzu girin");
        kilo=scan.nextInt();

        System.out.println("boyunuzu girin");
        boy=scan.nextDouble();

        scan.close();
    }
}
