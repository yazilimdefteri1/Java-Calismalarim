package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {

        // Her obje olusturdugumuzda model, yakit gibi degerleri
        // tek tek atama yapmak istemiyorsaniz
        
        Volvo arb1=new Volvo("XC60",false,2023,"Benzin");
        System.out.println(arb1.toString());
        System.out.println(arb1);
    }
}
