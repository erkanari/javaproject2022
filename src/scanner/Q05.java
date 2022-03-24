package scanner;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("ismini gir");

        char ilkHarf=scan.next().charAt(0);

        System.out.println("isminin ilk harfi "+ilkHarf);

    }
}
