package day43_garbage_abstractclass;

public abstract class C04 {

    /*
    bir abstract class'da abstract veya concrete method'lar bulunabilir.
    Child class'larin abstract metheod'lari override etmesi MECBURİ iken
                      concrete method'larin override edilmesi OPSİYONEL'dir
     */
    public abstract void absmethod1();

    public void cocreteMethod(){
        System.out.println("C04 concrete method");

    }

    public static void main(String[] args) {
        /* abstract class lar costructor'a sahiptir
        Ancak abstract class'lardan OBJE OLUSTURULAMAZ.

        Abstract class'lar OBJE BARINDIRMAYAN
        sadece child class'lar icin
        UYULMASI ŞART OLAN VEYA OPSİYONEL BURAKILAN
        ozellikleri tanimladigimiz bir depo class gibidir.
         */
      //  C04 obj= new C04();
        System.out.println("Bu class abstract");

    }
}
