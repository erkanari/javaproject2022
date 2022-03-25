package if_else_statement;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        // Soru 8) Kullanicidan maas icin bir teklif isteyin
        //		ve asagidaki degerlere gore cevap azdirin.
        //		Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //		60 – 80.000 arasinda ise “Konusabiliriz”,
        //		60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("teklif gir");
        int teklif= scan.nextInt();

        if (teklif>80000){
            System.out.println("Kabul ediyorum");
        }else if (teklif>60000){
            System.out.println("konusabiliriz");
        }else{
            System.out.println("Maalesef Kabul edemem");
        }

    }
}
