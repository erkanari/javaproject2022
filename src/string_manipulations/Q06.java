package string_manipulations;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        //		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //    	- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan=new Scanner(System.in);
        System.out.println("cümle gir");
        String cumle= scan.nextLine();
        System.out.println("kelime gir");
        String kelime= scan.next();
        int index=cumle.indexOf(kelime);

        if (index<0){
            System.out.println("kelime yok");

        }else if (cumle.indexOf(kelime,index+1)==(-1)){
            System.out.println("bir defa kullanıldı");
        }else {
            System.out.println("birden fazla kullanıldı");
        }






    }
}


