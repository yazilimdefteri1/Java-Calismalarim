package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        for (int i = 10; i <= 30; i++) {
            System.out.print(i);
            if (i < 30) {
                System.out.print(",");
            } else
                System.out.println("");
        }
        // 2.yöntem sonu virgulsuz yazdirma
        int baslangic = 10;
        int bitis = 30;
        for (int i = baslangic; i <= bitis; i++) {

            if (i < bitis) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }
        }
    }
}
