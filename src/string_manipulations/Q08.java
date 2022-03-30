package string_manipulations;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        //		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //    	- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle=scan.nextLine();
        System.out.println("kelime girin");
        String kelime= scan.next();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex<0){
            System.out.println("kelime kullanılmamış");
        }else if (ilkIndex==sonIndex){
            System.out.println("bir defa kullanılmış");
        }else {
            System.out.println("birden fazla kullanılmıs");
        }
    }
}
