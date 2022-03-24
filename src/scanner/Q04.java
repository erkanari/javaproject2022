package scanner;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini
        // ve dairenin alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("yarıcapı girin" );
        double yaricap=scan.nextDouble();

        double cevre=2*3.14*yaricap;

        double alan=3.14*yaricap*yaricap;

        System.out.println("çemberin cevresi "+cevre);
        System.out.println("dairenin alanı 8" +alan);
    }
}
