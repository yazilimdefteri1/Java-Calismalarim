package a02_kendiCalismalarim;

public class Constructor_Main {
    public static void main(String[] args) {
        ///---> Sınıf yapısından nesne türetme işlemini gerçekleştirelim <---\\\
        ConstructorEmploye employeManager = new ConstructorEmploye();
        ///---> Oluşturmuş olduğumuz nesne içerisindeki değişkenlere veri ataması gerçekleştirelim <---\\\
        employeManager.setIsim("Muzaffer");
        employeManager.setSoyisim("Çağlayan");
        employeManager.setYas(36);
        employeManager.setUnvan("Bilgisayar Mühendisi");
        employeManager.setMailAdresi("muzaffer@gmail.com");
        employeManager.setMaas(9500);
        ///---> Eklemiş olduğumuz verilerin çıktısını kontrol etmek için yazdir() metodunu çağıralım <---\\\
        employeManager.yazdir();
    }
}
