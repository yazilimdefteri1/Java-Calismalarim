package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01(); // default constructor devrede
        /*  Cons01 class'inda  hiç constructor olusturmazsak, Java default constructor'ı kullandigindan
            obj1 'i uretebiliriz

            Ancak biz parametreli veya parametresiz bir constructor yazdigimizda
            Java default constructor'i siler

            dolayisiyla bir herhangi bir constructor olusturdugumuzda
            daha once baska class'lar veya kullanicilarin
            olusturmus olabilecegi objeleri kullanabilmeleri icin
            default constructor'in islemini gerceklestirecek
            parametresiz bir constructor olusturmakta fayda var
         */
        Cons01 obj2= new Cons01("Java");

    }
}
