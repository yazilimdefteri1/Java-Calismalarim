package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi bir atrirmak icin
        sayi++;
        System.out.println(sayi); //11 yazdirir

        sayi++;
        System.out.println("pre-incrementten önce  " +  sayi); //12 yazdirir
        // eger 11.  ve 12. satieda yaptigim 2 islemi   tek satirda yaparsam
        //  java iki islemden once hangisini yapacagini bilmek ister
        // once artirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra artiririsak bu durumda eski aldigi degeri yazdirir


        System.out.println("pre-increment satirinda  " +  ++sayi);  // 13  once artir sonra yazdir
        System.out.println("pre-incrementten sonra  " +  sayi); // 13


        System.out.println("post-incremet satirinda  " +  sayi++); // 13
        System.out.println("post-incremetten sonra  "  + sayi); //14

        int a=15;
        int b=a++; // sonra artirdigi icin  b=a olur ve b yi 15 yazdirir  sonra a'yi bir artirir  16 yapar
        System.out.println(b);
        System.out.println(a);

        int c=15;
        int d=++c; // once artirdigi icin  d=c olur ve d yi 16 yapip yazdirir  zaten c'yi bir artirir  16 yapar
        System.out.println(d);
        System.out.println(c);



    }
}
