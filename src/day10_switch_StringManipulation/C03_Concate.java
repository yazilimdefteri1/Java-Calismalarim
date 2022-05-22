package day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        // Java Candir yazdiralim

        System.out.println(str1 + " " + str2);

        String cumle = str1.concat(str2);

        cumle = str1.concat(" ").concat(str2);

        System.out.println(cumle);

        // Concat icine String degilde sayi veya boolean deger yazsak?
        // Concat methodu icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String haline getirmeliyiz

        cumle=str1.concat(""+5);
        cumle=str1.concat(true+"");


    }
}
