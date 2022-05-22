package day09_ternary_Switch;

import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ayda oldugunuzu giriniz : ");
        int ay= scan.nextInt();

        switch(ay) {
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
                System.out.println("Bir yilda 12 ay bulunmaktadır" + " " + ay + " ay bulunmamaktadir");
        }
        }

}
