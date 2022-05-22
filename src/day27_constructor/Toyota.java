package day27_constructor;

public class Toyota {

    String marka = "Toyota";
    int tekerAdedi = 4;
    boolean motoruVarmi = true;
    String model;
    String yakit;
    int yil;

    public void maxHiz() {
        if (yakit.equals("Benzin")) {
            System.out.println("Benzinli arabalar max 240 km hiz yapar");
        } else if (yakit.equals("Dizel")) {
            System.out.println("Dizel arabalar max 260 km hiz yapar");
        }
    }

    public void renkTercihleri() {
        if (model.equals("Corolla")) {
            System.out.println("Corolla renk secenekleri Kirmizi ve Beyaz");
        } else if (model.equals("Yaris")) {
            System.out.println("Yaris renk secenekleri Sari ve Mavi");
        }

    }
}
