/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL */

import java.util.Scanner;
public class manavKasa {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\t*Manav kasa programina hos geldiniz*, \nMeyveler ve Kg Fiyatlari: \nArmut : 2,14 TL \nElma : 3,67 TL\nDomates : 1,11 TL\nMuz: 0,95 TL\nPatlican : 5,00 TL ");
        double ar, el, dom, muz, pat;

        System.out.print("Armuttan kaç kilo almak istersiniz: ");
        ar = input.nextDouble();

        System.out.print("Elmadan kaç kilo almak istersiniz: ");
        el = input.nextDouble();

        System.out.print("Domatesten kaç kilo almak istersiniz: ");
        dom = input.nextDouble();

        System.out.print("Muzdan kaç kilo almak istersiniz: ");
        muz = input.nextDouble();

        System.out.print("Patlicandan kaç kilo almak istersiniz: ");
        pat = input.nextDouble();


        double tutar = (ar*2.14)+(el*3.67)+(dom*1.11)+(muz*0.95)+(pat*5.0);
        System.out.println("Alişverişinizin toplam tutari: "+ tutar+ "TL.");
     }
    
}
