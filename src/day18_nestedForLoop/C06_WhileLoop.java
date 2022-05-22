package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tam sayi alip
        // bu sayilari ve aralarındaki tüm tam sayilari yazdiran bir kod yazin

        int baslangic = 40;
        int bitis = 60;

        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int i = baslangic;
        while (i <= bitis) {
            System.out.print(baslangic + " ");
            i++;
        }
        System.out.println("\n" + baslangic);


    }
}
