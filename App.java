import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

       System.out.print("Öğrencinin matematik notunu giriniz: ");
       double matematik = input.nextDouble();

       System.out.print("Öğrencinin fizik notunu giriniz: ");
       double fizik = input.nextDouble();

       System.out.print("Öğrencinin kimya notunu giriniz: ");
       double kimya = input.nextDouble();

       System.out.print("Öğrencinin tarih notunu giriniz: ");
       double tarih = input.nextDouble();

       System.out.print("Öğrencinin müzik notunu giriniz: ");
       double müzik = input.nextDouble();

       double notOrtalamasi = (matematik + fizik+kimya+tarih+müzik)/5;

       double geçme = 60.0;
       
       System.out.println("Öğrencinin sinavlarinin not ortalamasi = " + notOrtalamasi);
       String sonuc = notOrtalamasi >= geçme ? "Sinifi Geçti" : "sinifta kaldi";
       System.out.println(sonuc);
    }
}



