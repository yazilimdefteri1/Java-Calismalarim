package day07_ifElseStatements;

import java.util.Scanner;

public class C08_NotOgrenci {
    public static void main(String[] args) {

        System.out.println("=====SEVGİLERLE=======");

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 1.Vize notunu giriniz  :" );
        int vize1= scan.nextInt();
        System.out.println("Lütfen 2.Vize notunu giriniz  :" );
        int vize2= scan.nextInt();
        System.out.println("Lütfen Final notunu giriniz  :" );
        int Not= scan.nextInt();

        double dersNotu=((vize1*25/100)+(vize2*25/100)+(Not*50/100));

        System.out.println("Ders Notunuz : " + (int)dersNotu);

        if (dersNotu<45) {
            System.out.println("FF ile kaldiniz");}
        else if  (44<dersNotu && dersNotu < 55) {
            System.out.println(" DC ile kosullu geçtiniz"); }
         else if (54<dersNotu && dersNotu < 65) {
            System.out.println(" CC ile geçtiniz"); }
         else if (64<dersNotu && dersNotu < 70) {
            System.out.println(" CB ile geçtiniz"); }
         else if (69<dersNotu && dersNotu < 80) {
            System.out.println(" BB ile geçtiniz"); }
         else if (79<dersNotu && dersNotu < 90) {
            System.out.println(" BA ile geçtiniz"); }
         else if (89<dersNotu && dersNotu< 101) {
            System.out.println(" AA ile geçtiniz"); }


    }
}
