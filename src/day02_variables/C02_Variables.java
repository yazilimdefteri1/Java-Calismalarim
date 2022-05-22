package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        //eger istersek bir variable'i once declare edip sonra deger atayabiliriz

        String okulIsmi;

        //java deger ataması yapmadıgimiz bir variable olusturmamiza itiraz etmez
        //ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez

        okulIsmi="Yildiz Koleji";
       //Java calismaya main method tan baslar.
        //sonra yukaridan asagi, soldan saga dogru calisir.

        System.out.println(okulIsmi);

        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);//println ile print arasindaki fark
        System.out.print(okulIsmi); //  println de alt satira gecer yazdirir
        System.out.print(okulIsmi); // print te ise alt satira gecmez
        // atanan en son degeri kabul eder

    }
}
