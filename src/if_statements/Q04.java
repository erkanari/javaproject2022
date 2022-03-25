package if_statements;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //         ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("1. kenar uzunlugunu girin");
        int kenar1=scan.nextInt();
        System.out.println("2. kenar uzunlugunu girin");
        int kenar2=scan.nextInt();

        if (kenar1==kenar2){
            System.out.println("kare");
        }
        if (kenar1!=kenar2){
            System.out.println("dikdörtgen");
        }
    }
}
