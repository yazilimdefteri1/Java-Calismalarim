package day34_accessModifier_encapsulation;

public class C03 {

    // burada encapsule edecedigimiz 2 variable olsun

    private int sayi=25;
    private String str;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi + " str=" + str;

    }
}
