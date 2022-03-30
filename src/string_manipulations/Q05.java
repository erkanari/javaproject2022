package string_manipulations;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin

    Scanner scan=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle= scan.nextLine();

        System.out.println("karakter girin");
        char krk=scan.next().charAt(0);

        int index=cumle.indexOf(krk);

        if (index==-1){
            System.out.println("cumlede karakter yer almıyor");
        }else {
            System.out.println("cumlede karakter yer alıyor");
        }


    }
}
