package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println(a + b);
        }
        if (a == b) {
            System.out.println("verilen sayilar esit degil");
        }
        if (a > 100) {
            System.out.println("a yuzden buyuk");
        }
        if (a * b > 5) {
            System.out.println("sayilarin csarpimi 5'ten buyuk");
        }
        // bagimsiz if cumleleri  kendileri disindaki kodlarla ilgilenmez
        // bbir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cümlesi oldugunda hepsinin body calisabilecegi gibi
        // hicbirisinin body'si calismayadabilir
    }
}
