package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi“ ,
        // @gmail.com ile bitmiyorsa "Lutfen yazimi kontol edin" yazdirin

        String email= "mulkiyeayboy@gmail.com"; // hotmail.com, gmail.com, yandex.com, gmail.com.tr olarak deneme yaptik
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }
        else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi");
        }
        else {
            System.out.println("Lutfen yazimi kontol edin");

        }
    }
}
