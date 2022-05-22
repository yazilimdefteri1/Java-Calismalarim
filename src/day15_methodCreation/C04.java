package day15_methodCreation;

public class C04 {

    // main method olmadan da bir Class olusturulabilir
    // Ancak bu Class calismaz
    // Sadece depo görevi gorur
    // baska class'lardan kullanilabilecek method veya variable'lari barindirir

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println(" Girdiginiz kelimedeki harf sayisi : 5");
        System.out.println(tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println(" Girdiginiz kelimedeki harf sayisi : 4");
        System.out.println(tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println(" Girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println(tersKelime);
    }
}
