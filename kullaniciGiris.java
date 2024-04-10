/*Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız */
import java.util.Scanner;
public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName,password,newPassword,cevap;

        System.out.println("Kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.println("Sifrenizi giriniz: ");
        password = input.nextLine();
    
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Basarili giris yaptiniz");
        }
        else{
            System.out.println("Hatali giris yaptiniz.");
            System.out.println("Sifrenizi sifirlamak ister misiniz[evet/hayir]: ");
            cevap = input.nextLine();
            if(cevap.equals("evet")){
                System.out.println("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();
                if(password!=newPassword){
                    System.out.println("Sifre olusturulamadi, Lütfen baska sifre giriniz.");
                }else{
                    System.out.println("Sifre olusturuldu.");
                }
            }else if(cevap.equals("hayir")){
                System.out.println("Sifre sifirlanmayacaktir.");
            }
            }
        }


    }

