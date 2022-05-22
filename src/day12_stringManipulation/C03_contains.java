package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi“ ,
        // @gmail.com ile bitmiyorsa "Lutfen yazimi kontol edin" yazdirin

        String email= "mulkiyeayboy@gmail.com."; // hotmail.com, gmail.com, yandex.com, gmail.com.tr olarak deneme yaptik
        String arananMetin= "@gmail.com";

        if ( !email.contains(arananMetin)){  //***ÖNEMLİ*** başa konulan ünlem if içerisinde ki işlemin tersi için kullanilir

            System.out.println("Lutfen gmail adresi giriniz");
        }
        else if (email.lastIndexOf(arananMetin)==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");
        }
        else {
            System.out.println("Lutfen yazimi kontol edin");
        }
    }
}
