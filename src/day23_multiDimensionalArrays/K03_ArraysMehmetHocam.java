package day23_multiDimensionalArrays;

public class K03_ArraysMehmetHocam {

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

        for (int x = 0; x < 5; x++) {
            System.out.print(ogrenciBilgi[x][0]+ "  Okulundaki ");
            System.out.print(ogrenciBilgi[x][1]+ " Sinifindaki ");
            System.out.print(ogrenciBilgi[x][2]+ " İsimli ");
            System.out.print(" Ögrenci numarasi " + ogrenciBilgi[x][3]+ " dir");
            System.out.println();
        }
    }
}
