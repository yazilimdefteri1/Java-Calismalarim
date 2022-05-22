package a01_kendiCalismalarim;

import java.util.Scanner;

public class A19_TasKagitMakasOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kcount = 0;
        int pcount = 0;
        while (true) {
            System.out.println("Tas icin 0, kagit icin 1 ve makas icin 2'yi tuslayiniz seceneklerinden birini giriniz");
            int num = scan.nextInt();
            int random = (int) (Math.random() * 3);
            if (num <= 2) {
                if (num == 0 && random == 1) {
                    pcount++;
                    System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 0 && random == 2) {
                    kcount++;
                    System.out.println("kazandiniz Pc kaybetti" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 2 && random == 0) {
                    pcount++;
                    System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 1 && random == 0) {
                    kcount++;
                    System.out.println("kazandiniz Pc kaybetti" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 2 && random == 1) {
                    kcount++;
                    System.out.println("kazandiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 1 && random == 2) {
                    pcount++;
                    System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
                } else if (num == 0 && random == 0 || num == 1 && random == 1 || num == 2 && random == 2) {
                    System.out.println("Berabere kaldiniz");
                }
            } else {
                System.out.println("2'den buyuk ya da negatif bir deger girdiniz tekrar deneyiniz");
            }
            System.out.println(" devam etmek isityor musunuz? evet ise 1 hayir ise 0'a basiniz");
            int num1 = scan.nextInt();
            if (num1 == 1) {
                continue;
            }
            if (num1 == 0) {
                if (kcount < pcount) {
                    System.out.println("yarisi kaybettiniz. net puaniniz= " + kcount);
                } else {
                    System.out.println("tebrikler kazandiniz! .Net puaniniz= " + kcount);
                }
                break;
            }
        }
    }
}
