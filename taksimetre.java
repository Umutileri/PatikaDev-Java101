/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) throws Exception {
     Scanner input = new Scanner(System.in);
        System.out.println("Taksi'de Minimum ödenecek tutar 20 TL'dir. 20 TL altinda ki ücretlerde yine 20 TL alinacaktir.");
        System.out.println("Taksimetre açilis ücreti ise 10TL'dir.");

        System.out.print("Gidilen mesafeyi(KM) giriniz: ");
        int km = input.nextInt();
    
        double taksimetre = 2.20;
        double acilis=10.0;
        double tutar;
        tutar = (km*taksimetre)+acilis;
        if(tutar<=20){
            tutar = 20;
        }
        System.out.println("Toplam tutar: "+ tutar+" TL.");

     }
}
