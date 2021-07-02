import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        double fiyat;
        System.out.print("Tutarı giriniz:");
        Scanner i = new Scanner(System.in);
        fiyat = i.nextDouble();
        double kdv = fiyat<=1000 && fiyat >=0 ? 0.18 : 0.8;
        double tutar = fiyat*kdv;
        double sonuc = fiyat + tutar;
        System.out.println("KDV'siz tutar = " +fiyat);
        System.out.println("KDV'li tutar = " +sonuc);
        System.out.println("KDV tutarı = " +tutar);
    }
}
