package day36_inheritance;

public class Child extends  Parent{

    Child(){
        super(); // biz yazdik olmasada super Cons (Parent Cons)  zaten var
       System.out.println("Child cons. calisti");
    }
    // Tum Class'larda biz gormesek bile
    // Java'nin olusturdugu default constructor vardir

    // Extends Keyword kullanan class'lardaki
    // Tum CONSTRUCTOR'larin ilk satirinda
    // biz gormesek bile super() Constructor call vardir
    // Yani Parent Class'in Parametresiz Constructor'ı call
    public static void main(String[] args) {
        Child child= new Child();
    }
}
