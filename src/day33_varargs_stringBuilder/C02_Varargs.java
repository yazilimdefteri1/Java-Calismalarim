package day33_varargs_stringBuilder;

public class C02_Varargs {
    // parametre olarak bir integer ve istediğimiz kadar String alan
    // en uzun kelimenin harf sayisi ile int parametre değerini
    // carpip sonucu yazdiran bir method olusturun
    public static void main(String[] args) {


        int sayi = 5;
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Abdurrahman";

        enUzunlaCarpim(sayi, str1, str2, str3, str4);
        // bir method'da varargs disinda parametre kullanacaksak
        // önce diğer parametreleri yazip varargs'i en sona yazmaliyiz
        // bu sebeple bir method'da birden fazla varargs olamaz
    }

    private static void enUzunlaCarpim(int sayi, String... str) {

        String enUzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        sayi = sayi * enUzunStr.length();
        System.out.println(" En uzunla int sayinin carpimi : " + sayi);
    }

}
