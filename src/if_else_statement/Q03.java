package if_else_statement;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Soru 3) Kullaniciya yasini sorun,
        //         	eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        //			65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("yasınızı girin");
        int yas=scan.nextInt();

        if (yas>65){
            System.out.println("emekli olabiir");

        }else {
            System.out.println("emekli olamazsın");
        }
    }
}
