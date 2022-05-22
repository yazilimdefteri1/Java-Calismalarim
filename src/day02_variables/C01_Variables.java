package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        // bir variable oluştururken içerisine koyabilecegimiz datanin alabilecegi degerlere uygun
        //bir data turu secmeliyiz
        //ornegin bir sehrin nufusundan bahsediyorsak
        //variable'mizin data turu String, boolean, char veya doble olamaz
        //geriye kalan tamsayi türlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu secebiliriz
        // biz kurs süresince genelde tam sayilar icin int, ondalikli sayilar icin doble kullanacagiz
        System.out.println("Hello World yazdiran javayi halleder");

        int level=1;

        System.out.println(level);

        boolean ogrenciMi=true;
        boolean yagisVarmi=false;
        System.out.println(ogrenciMi);
        char ozelSembol='&';
        char sayi='5';
        char harf='K';
        System.out.println(harf);


    }
}
