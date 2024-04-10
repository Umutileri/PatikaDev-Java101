/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173 */

import java.util.Scanner;
public class Vki {
    public static void main(String[] args) throws Exception {
        System.out.println("Vücut kitle Indeksi Hesaplama");
        Scanner input = new Scanner(System.in);

        double kg,m;

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
        m = input.nextDouble();

        System.out.print("Lütfen kilonuzu(kg) giriniz: ");
        kg = input.nextDouble();

        double indeks = kg/(m*m); 

        System.out.println("Vüctle kitle Indeksiniz: "+ indeks);



    }

}
