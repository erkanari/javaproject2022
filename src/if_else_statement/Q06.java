package if_else_statement;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        //			Not’u harf sistemine cevirip yazdirin.
        //			50’den kucukse “D”,
        //			50 ye esit ve buyuk  ve 60 dan kucuk ise “C”,
        //			60 a esit ve buyuk  ve 80 dan kucuk ise “B”,
        //			80 ve uzerinde ise “A”
        Scanner scan=new Scanner(System.in);
        System.out.println(" 100 uzerinden notunu gir");
        int not=scan.nextInt();

       if (not<0 || not>100){
           System.out.println("geçerli not girin");
       }else if (not<50){
           System.out.println("D");
       }else if (not<60){
           System.out.println("C");
       }else if (not<80){
           System.out.println("B");
       }else {
           System.out.println("A");
       }
    }
}
