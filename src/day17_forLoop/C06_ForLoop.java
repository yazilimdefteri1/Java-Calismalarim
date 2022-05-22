package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarındaki harfleri yazdiran
        // bir kod yaziniz
        char ilkHarf='y';
        char sonHarf='d';

        for (char i = ilkHarf; i >= sonHarf; i--) {
            System.out.print(i+ " ");

        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        // baslangic ve bitis arasında artis miktari ile olusacak
        // tum sayilari yazdirin
        for (double i = baslangic; i <=bitis; i+=artis) {
            System.out.println(i+ " ");

        }


    }
}
