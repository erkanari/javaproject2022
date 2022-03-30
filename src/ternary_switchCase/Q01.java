package ternary_switchCase;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi1=scan.nextInt();
        System.out.println("sayi girin");
        int sayi2=scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
