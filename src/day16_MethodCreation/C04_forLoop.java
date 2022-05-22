package day16_MethodCreation;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        // verilen string'i tersten yazdiran bir kod yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz : ");
        String str= scanner.nextLine();


        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,(i+1)));

        }

    }

}
