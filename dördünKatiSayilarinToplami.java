/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */

import java.util.Scanner;
public class dördünKatiSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int sum=0;
        System.out.println("Programimin tanimi: \nTek bir sayi girilene kadar girilen çift ve 4'ün kati olan sayileri toplar ve ekrana basar.");
        do{ 

            System.out.print("Lütfen bir sayi giriniz: ");
            sayi = input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                sum +=sayi;
            }
        }while(sayi%2==0);
        System.out.println("Tek sayi girdiginiz için program sonlandirildi!");
        System.out.println("Toplam= "+sum);
    }
}
