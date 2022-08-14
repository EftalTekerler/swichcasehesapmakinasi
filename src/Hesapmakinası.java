import java.util.Scanner;
public class Hesapmakinası {
    public static void main(String[] args) {
        int n1,n2,select,sonuc = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı giriniz");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();
        switch (select) {
            case 1 : {
                select = n1 + n2;
                System.out.print("Seçilen İşlem:1-Toplama\n--\nİşlemin Sonucu:" + sonuc);
            }
            case 2 : {
                select = n1 - n2;
                System.out.print("Seçilen İşlem:2-Çıkarma\n--\nİşlemin Sonucu:" + sonuc);
            }
            case 3 : {
                select = n1 * n2;
                System.out.print("Seçilen İşlem:3-Çarpma\n--\nİşlemin Sonucu:" + sonuc);
            }
            case 4 : {
                select = n1 / n2;
                System.out.print("Seçilen İşlem:4-Bölme\n--\nİşlemin Sonucu:" + sonuc);
            }
            default : System.out.print("Seçilen İşlem:Böyle Bir İşlem Bulunamadı.\nHatalı Giriş Yapıldı!");


        }
    }
}
