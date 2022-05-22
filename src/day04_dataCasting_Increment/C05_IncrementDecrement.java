package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi + 10);  // 30

        sayi=sayi+10;
        System.out.println(sayi);//30

        System.out.println(sayi=sayi+10);//40
        System.out.println(sayi +=10);

        sayi +=10;
        System.out.println(sayi);//50

        sayi ++ ;
        System.out.println(sayi);//51

        System.out.println("21.satir : "+ sayi++);
        System.out.println("22.satir : "+ sayi);  //52

        System.out.println("24. satir : "  + ++sayi);
        System.out.println("25.satir : "+ sayi);  //53

        sayi=sayi-10;
        System.out.println(sayi); //41

        sayi-=10;
        System.out.println(sayi);//31

        sayi --;
        System.out.println(sayi);//30


            //bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz assigment et

    }
}
