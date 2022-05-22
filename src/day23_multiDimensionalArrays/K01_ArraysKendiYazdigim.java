package day23_multiDimensionalArrays;

public class K01_ArraysKendiYazdigim {
    public static void main(String[] args) {

        Object ilce[][][][] = new Object[5][5][5][5];
        String okul[] = new String[]{"Yildiz", "Uzay", "Ceyhan", "Doga", "Egitim","Maya"};
        String sinif[] = new String[]{"A", "B", "C", "D", "E","F"};
        String ogrenci[] =new String[]{"Ali", "Veli", "Hasan", "Hüseyin", "Temel","Dursun"};
        String ogrenciNo[] =new String[]{"100", "101", "102", "103", "104","105"};


        for (int i = 0; i < 5; i++) {
            ilce[0][i][0][0] = okul[i];
            System.out.println( ilce[0][i][0][0]+" Okullari");
        }
        for (int j = 0; j < 5; j++) {
            ilce[0][1][j][0] = sinif[j];
            System.out.println( ilce[0][1][0][0]+" Okulunun " +ilce[0][1][j][0]+" Sinifi");
        }
        for (int k = 0; k < 5; k++) {
            ilce[0][2][k][0] = sinif[k];
            System.out.println( ilce[0][2][0][0]+" Okulunun " +ilce[0][2][k][0]+" Sinifi");
        }


       /* //for (int j = 0; j < 5; j++) {
        ilce[0][1][0][0] = sinif[1];
        //  }
        for (int k = 0; k < 5; k++) {
            ilce[0][0][k][0] = ogrenci[k];
        }
        for (int l = 0; l < 5; l++) {
            ilce[0][0][0][l] = ogrenciNo[l];

        }

        for (int x = 0; x < 5; x++) {

            System.out.print(ilce[x][0][0][0]+ "  Okulundaki ");
            System.out.print(ilce[0][1][0][0]+ " Sinifindaki ");
            System.out.print(ilce[0][0][x][0]+ " İsimli ");
            System.out.print(" Ögrenci numarasi " + ilce[0][0][0][x]+ " dir");
            System.out.println();
        }*/
    }
}
