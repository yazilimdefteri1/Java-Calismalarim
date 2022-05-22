package day26_forEachLoop_constructor;

public class Araba {
 /* Java'da her Class olusturdugumuzda
    Java o Class'tan ileride objeler üretmek gerekecegini bilir.'
    ve biz ozellikle belirtmesek te Java
    her olusturdugu Class'a bir constructor koyar.

    Java' nin Class olustururken Class'a kpydugu constructor'a
    DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

    Eger biz halae gorunur bir constructor' imiz olsun istersek
    default constructor ile ayni gorevi yapan bir constructor 'da olusturabiliriz.
    veya istersek ayni kaliptan farklı desenlerde objeler olusturmak icin
    Farkli ozelliklerde constructor'larda olusturabiliriz.

    constructor'lari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayisi ve parametre data turudur.
  */

    public Araba() {
        System.out.println("parametresiz constructor calisti");
    }
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil +  " model bir araba uretildi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil +  " model " + renk + " renginde bir araba uretildi");
    }
    /* bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
     iki seye dikkat etmelisiniz
     1- Constructor 'in ismi Class ismi ile ayni olmak zorundadir. yani buyuk harfle baslar
     2- Constructor'larin return type'i olmaz

     ozetle : constructor'in adi Class adi ile ayni olmali ve return type'i olmamali
     */
}
