package day06_concatenationOperators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);  // false

        boolean sonuc1=5>4 && 7<9 &&  6+3==9  && 5+2!=8;  //aşagida true yazdirir
        System.out.println(sonuc1);  //true


        boolean sonuc2 =  5>4 && 7>9 &&  6+3==9  && 5+2!=8;  //aşagida false yazdirir
        System.out.println(sonuc2);  //false

        boolean sonuc3 =  5>4 & 7>9 &  6+3==9  & 5+2!=8;  //aşagida false yazdirir
        System.out.println(sonuc3);  //false

        // cift && tek & ile arasindaki fark
        // Cift &&  te  java False görunce duru ve sonrasına bakmaz cunku sonuc zaten false olacak der
        // Tek & te Java islemi sonuna kadar ve sonra false der
        // bu yüzden zaman kazanma acisindan ve hafizayi yormama adina cift &&  tercih edilebilir


        int sayi3=15;
        //sayi3 'un  10 ile 20 arasinda oldugunu ispatlayalim

        System.out.println(sayi3>10 && sayi3<20);  //true
        System.out.println(sayi3<10 || sayi3>20);  //false  toplama islemine benzer bir true yeterlidir
        System.out.println(sayi3>10 || sayi3<20);   //true  toplama islemine benzer bir true yeterlidir

        int sayi4=5;
        // sayi4'un 10 ile 15'in arasinda olmadigini true yaparak dondurelim

        System.out.println(sayi4<10  ||  sayi4>20);  //true  toplama islemine benzer bir true yeterlidir
        System.out.println(sayi4>10  ||  sayi4<20);  //true  toplama islemine benzer bir true yeterlidir


    }
}
