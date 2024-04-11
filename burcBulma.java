/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız. */

import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\tDogum ayinize ve gününüze göre burc bulma uygulamasinsa hos geldiniz");
        System.out.print("Dogum ayinizi giriniz[1-12]: ");
        int mounth = input.nextInt();

        System.out.print("Dogum gününüzü giriniz[1-31]: ");
        int day = input.nextInt();

        if(mounth==1){
            if(day<=21){
                System.out.println("Oğlak Burcu");
            }else{
                System.out.println("Kova Burcu");
            }
        }else if(mounth==2){
            if(day<=19){
                System.out.println("Kova Burcu");
            }else{
                System.out.println("Balik Burcu");
            }
        }else if(mounth==3){
            if(day<=20){
                System.out.println("Balik burcu");
            }else{
                System.out.println("Koç Burcu");
            }
        }else if(mounth==4){
            if(day<=20){
                System.out.println("Koç Burcu");
            }else{
                System.out.println("Boğa Burcu");
            }
        }else if(mounth==5){
            if(day<=21){
                System.out.println("Boğa Burcu");
            }else{
                System.out.println("İkizler Burcu");
            }
        }else if(mounth==6){
            if(day<=22){
                System.out.println("İkizler Burcu");
            }else{
                System.out.println("Yengeç Burcu");
            }
        }else if(mounth==7){
            if(day<=22){
                System.out.println("Yengeç Burcu");
            }else{
                System.out.println("Aslan Burcu");
            }
        }else if(mounth==8){
            if(day<=22){
                System.out.println("Aslan Burcu");
            }else{
                System.out.println("Başak Burcu");
            }
        }else if(mounth==9){
            if(day<=22){
                System.out.println("Başak Burcu");
            }else{
                System.out.println("Terazi Burcu");
            }
        }else if(mounth==10){
            if(day<=22){
                System.out.println("Terazi Burcu");
            }else{
                System.out.println("Akrep Burcu");
            }
        }else if(mounth==11){
            if(day<=21){
                System.out.println("Akrep Burcu");
            }else{
                System.out.println("Yay Burcu");
            }
        }else{
            if(day<=21){
                System.out.println("Yay Burcu");
            }else{
                System.out.println("Oğlak Burcu");
            }
        }
    }    
    
}
