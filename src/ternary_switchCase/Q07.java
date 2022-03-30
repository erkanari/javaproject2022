package ternary_switchCase;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        //gun numarasina gore hafta ici veya hafta sonu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("gün no gir" );
        int günNo= scan.nextInt();

        switch (günNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecersiz bir rakam girdiniz");
        }

    }
}
