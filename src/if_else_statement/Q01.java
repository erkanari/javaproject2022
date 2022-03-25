package if_else_statement;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //         ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("kenar uzunlugu gir");
        int kenar1=scan.nextInt();
        System.out.println("kenar uzunlugu gir");
        int kenar2=scan.nextInt();

        if (kenar1==kenar2){
            System.out.println("kare");
        } else {
            System.out.println("dikdörtgen");
        }



    }
}
