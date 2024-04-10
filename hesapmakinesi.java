/*Ödev
Videodaki hesap makinesini switch-case kullanarak yapınız. */

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {

        System.out.println("Hesap makinesi uygulamasina hos geldiniz!");
        System.out.println("1- Toplama\n2-Çikarma\n3-Bölme\n4-Çarpma");

        int menü,number1,number2,toplam,çikarma,çarpma;

        Scanner input = new Scanner(System.in);
        System.out.print("Yapmak istedigniz islem nedir[1-4]: ");
        menü = input.nextInt();

        System.out.print("Birinci sayiyi giriniz: ");
        number1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        number2 = input.nextInt();

        switch (menü) {
            case 1:
                toplam = number1 + number2;
                System.out.println("Toplam: "+toplam);
                break;
            case 2:
                çikarma = number1 - number2;
                System.out.println("Fark: "+çikarma);
                break;
            case 3:
               if(number1!=0 && number2!=0){
                    double bölme = number1/number2;
                    System.out.println("Bölüm: "+bölme);
               }else{
                System.out.println("Bir sayi sifira bölünemez!");
               }
            break;
                
            case 4:
                çarpma = number1*number2;
                System.out.println("Çarpim: "+çarpma);
                break;
            default:
                break;
        }
        
    }
}
