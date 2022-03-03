package variables;

public class Q01 {
    public static void main(String[] args) {
        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5

        int sayi=12345;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yüzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;

        System.out.println(onbinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);

    }
}
