package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

       // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve
        // girilen kelimeyi ilk harfi büyük
        // digerleri kucuk olaraktersten yazdirin.

        String input="Mavi";

        System.out.println(input.substring(3) + input.substring(2,3) + input.substring(1,2)+ input.substring(0,1)) ;
        System.out.println(input.charAt(3)+""+input.charAt(2)+""+input.charAt(1)+input.charAt(0));
        String tersStr= input.substring(3).toUpperCase()+
                        input.substring(2,3).toLowerCase()+
                        input.substring(1,2).toLowerCase()+
                        input.substring(0,1).toLowerCase();

        System.out.println(tersStr);



    }
}
