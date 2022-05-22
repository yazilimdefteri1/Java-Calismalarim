package day10_switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {
        // String 'de herhangi bir karakteri almak istediğimizde
        // o harfin indeksini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str ="Java Cok Guzel";

        // J'yi yaziralim

        System.out.println(str.charAt(0));  // index sıfırdan basladigi icin ona göre index girmeliyiz
                                            // örnek J için 0 demeliyiz

        System.out.println(str.charAt(9)); // boşlukta bir karakter olarak sayilir

        // va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));

        // cOK yazdiralim
        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));
            //****Stringi ilgilendiren bir method varsa charAt ten önce kullanmaliyiz****

        //son harfi yazdir
        // String de 14 harf var, son harfin index'i 14-1
        System.out.println(str.charAt(14-1));

    }
}
