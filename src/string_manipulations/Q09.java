package string_manipulations;

public class Q09 {
    public static void main(String[] args) {
        String cumle= "Calisirsaniz, java ogrenmek cok kolay";

        System.out.println(cumle.contains(" ")); // true
        System.out.println(cumle.contains("iz, j")); // true

        System.out.println(cumle.contains("Hasan")); // false
    }
}
