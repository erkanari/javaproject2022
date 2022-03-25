package if_else_statement;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir karakter girmesini isteyin ve
        //         girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter girin");
        char karakter=scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')) {
            System.out.println("girdiginiz "+karakter+" bir harfdir");

        } else {
            System.out.println("girdiginiz "+karakter+" bir harf degildir");

        }

    }
}
