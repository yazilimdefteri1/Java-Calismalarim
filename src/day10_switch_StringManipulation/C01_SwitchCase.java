package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //kullanicidan sayi olarak kacinci ay oldugunu alip
        //istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunuzu giriniz : ");
        int ayNo= scan.nextInt();

        //Bu soruyu ifelse ile yapabiliriz
        //ama artarda 12 ifelse cok kalabalik ve anlasilmasi guc olabilir
        //Bunun yerine SwitchCase yapisini kullanabiliriz

        switch(ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Hazirank");
                break;
            case 7:
                System.out.println("Temmuzt");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralik");
                break;

            default:
                System.out.println("Bir yilda 12 ay bulunmaktadır" + " " + ayNo + " ay bulunmamaktadir");
        }
    }
}
