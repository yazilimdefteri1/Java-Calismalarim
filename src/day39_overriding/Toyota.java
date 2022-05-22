package day39_overriding;

public class Toyota extends Araba {

    String hiz="Toyota araclar maximum 220 km hiz yaparlar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";

    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanirlar");
    }

    public void garanti(){
        System.out.println("Toyota arabalar 10 yil garantilidir");
    }
}
