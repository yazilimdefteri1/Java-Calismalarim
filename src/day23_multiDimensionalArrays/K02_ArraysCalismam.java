package day23_multiDimensionalArrays;

import java.util.Random;

public class K02_ArraysCalismam {
    public static void main(String[] args) {

    Random random = new Random();
    // Dizi Tanımlaması:
    int [] randomDizi = new int[10];
        System.out.println("Random Oluşturulan Dizi:\n----------");
    // Diziye Random Değerler Tanımlama:
        for(int i=0;i<randomDizi.length;i++) {
        randomDizi[i] = random.nextInt(100)+1;
        System.out.print("["+randomDizi[i]+"]");
    }
        System.out.print("\n----------\nBüyükten Küçüğe Sıralanmış Hali:\n----------");
        for(int k=1;k<randomDizi.length;k++){
        int saklamaKabi;
        for(int j=0;j<10-k;j++){
            if(randomDizi[j]<randomDizi[j+1]) {
                saklamaKabi = randomDizi[j];
                randomDizi[j] = randomDizi[j + 1];
                randomDizi[j + 1] = saklamaKabi;
            }
        }
    }
        System.out.println("");
        for(int x=0;x< randomDizi.length;x++)
            System.out.print("["+randomDizi[x]+"]");
}
}
