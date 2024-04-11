/*Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

import java.util.Scanner;
public class sicaklikEtkinlikOnerme{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------Sicakliga göre Etkinlik önerme uygulamasina hos geldiniz------");
        System.out.print("Günün sicaklik seviyesini giriniz: ");
        int heat = input.nextInt();

        if(heat<5){
            System.out.println("Kayak");
        }else if(heat<15){
            System.out.println("Sinema");
        }else if(heat<25){
            System.out.println("Piknik");
        }else{
            System.out.println("Yüzme");
        }
    }
}
