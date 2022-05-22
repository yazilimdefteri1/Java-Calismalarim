package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12,"el sokma"));
        String str1="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str1,0,8));

        System.out.println(sb1.reverse()); // degistirdiginde sb1'i kalici degistirir
        System.out.println(sb1.reverse()); // tekrar degistirdik

        StringBuilder sb2=new StringBuilder("Java can");
        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2)); //0
        //System.out.println(sb1.compareTo(str));

        System.out.println(sb1.compareTo(sb2)); //0


        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));

        System.out.println(sb1.subSequence(3,7));
        sb1.setCharAt(3,'k');
        System.out.println(sb1);



    }

}
