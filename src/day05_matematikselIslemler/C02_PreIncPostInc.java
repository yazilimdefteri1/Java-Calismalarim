package day05_matematikselIslemler;

public class C02_PreIncPostInc {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi1 + " , " +  sayi2 + " , "+ sayi3);


        sayi3=++sayi1;


        System.out.println(sayi1 + " , " +  sayi2 + " , "+ sayi3);

        System.out.println(sayi3++);  //  12  once yazdir sonra artir.
        System.out.println(sayi3);  // 13

        System.out.println(--sayi2); // 9  once azalt sonra yazdir

        int z=10;
int y=5;
        z=z++; // esitligin soltarafına sagtaraftaki aynı variable i verince z degeri hep ayni kaliyor.
        y=z++;  // esitligin soltarafına farklı variable verincey once z ye esitlenir sonra  z degeri bir artar
        System.out.println(z );
               System.out.println(y);






    }
}
