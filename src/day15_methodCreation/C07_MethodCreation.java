package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //String str="Ali";
        // Stringi yazdiran method olusturalim

       // stringYazdir(str);

        // Hosgeldiniz bir method olusturun
        //hosgeldinYazdir();

        // Kapanma mesaji yazan bir method olusturalim
        //kapanmaMethodu();

        hosgeldinYazdir();
       // stringYazdir("Java gun gectikce guzellesiyor");
       // kapanmaMethodu();
    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin teşekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
