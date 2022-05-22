package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /* Bir variable' i encapsule etmek icin
           1-) Access modifier'i private yapariz
           2-) okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabilir
              - Eger sadece okunmasini istiyorsaniz getter
              - Eger sadece deger girilebilsin istiyorsaniz setter
              methodlarini olustururuz.

           Bir variable icin hem getter hem setter olusturursaniz
           o variable public olmus gibi hem okuyup hem de deger girilebilmesini saglayabilirsiniz.
         */
        C03 obj=new C03();

        System.out.println(obj.getSayi());
        obj.setSayi(20);
        System.out.println(obj.getSayi());

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());

        System.out.println(obj);


    }
}
