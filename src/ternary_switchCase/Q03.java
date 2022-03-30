package ternary_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("sayi girin");
        double sayi= scan.nextDouble();

        System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);
    }
}
