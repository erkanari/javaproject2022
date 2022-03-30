package ternary_switchCase;

public class Q08 {
    public static void main(String[] args) {
        // Harf olarak girilen notu rakama cevirelim

        char not = 'C';
        switch (not) {
            case 'A':
                System.out.println("85-100 arası");
                break;
            case 'B':
                System.out.println("70-85 arasi");
                break;
            case 'C':
                System.out.println("50-70 arasi");
                break;
            case 'D':
                System.out.println("30-50 arasi");
                break;
            case 'E':
                System.out.println("0-30 arasi");
                break;

            default:
                System.out.println("gecersiz harf");


        }
    }
}
