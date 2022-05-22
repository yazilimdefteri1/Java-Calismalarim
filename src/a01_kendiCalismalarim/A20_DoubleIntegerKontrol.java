package a01_kendiCalismalarim;

import java.util.Scanner;

public class A20_DoubleIntegerKontrol {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
    Double number=scan.nextDouble();
        System.out.println(number);
  Double kontrol=number%1;
        System.out.println(kontrol);


    if(kontrol!=0)
    {
        System.out.println("not a integer");
    }
    else
    {
        System.out.println("integer");
    }
    }
}
