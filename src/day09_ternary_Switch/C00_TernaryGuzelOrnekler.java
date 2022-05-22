package day09_ternary_Switch;

public class C00_TernaryGuzelOrnekler {
    public static void main(String[] args) {

        int y=1;
        int z=1;
        int a=y<10 ? y++ : z++;
        System.out.println(y+","+z+","+a);

        int b=11;
        System.out.println((b>5) ? (b<10 ? 2*b : 3*b) : ( b>10 ? 2+b : 3+b));

    }
}
