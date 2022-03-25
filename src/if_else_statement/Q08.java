package if_else_statement;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("yasını gir");
        int yas=scan.nextInt();

        if (cinsiyet=='E'){
            if (yas>65){
                System.out.println("emekli");
            } else {
                System.out.println("emekli olamaz");

            }

        }else if (cinsiyet=='K'){

            if (yas>60){
                System.out.println("emekli");
            }else {
                System.out.println("emekli olamaz");
            }

        }else {
            System.out.println("gecerli harf gir");
        }
    }
}
