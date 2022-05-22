package day23_multiDimensionalArrays;

public class K04_arraysKendiZorla {
    public static void main(String[] args) {

        Object ogrenciBilgi[][] = new Object[5][4];
        String okul[] = new String[]{"Yildiz", "Uzay", "Ceyhan", "Doga", "Egitim","Maya"};
        String sinif[] = new String[]{"A", "B", "C", "D", "E","F"};
        String ogrenci[] =new String[]{"Ali", "Veli", "Hasan", "Hüseyin", "Temel","Dursun"};
        String ogrenciNo[] =new String[]{"100", "101", "102", "103", "104","105"};
        for (int i = 0; i < 5; i++) {
            ogrenciBilgi[i][0] = okul[i];
            ogrenciBilgi[i][1] = sinif[i];
            ogrenciBilgi[i][2] = ogrenci[i];
            ogrenciBilgi[i][3] = ogrenciNo[i];
        }

    }
}
