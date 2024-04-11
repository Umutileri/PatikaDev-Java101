/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
import java.util.Scanner;
public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,tür,kim,müz;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
        }

        System.out.print("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        if(fiz<0 || fiz>100){
            fiz =0;
        }

        System.out.print("Türkçe notunu giriniz: ");
        tür = input.nextInt();
        if(tür<0 || tür>100){
            tür =0;
        }
        System.out.print("Kimya notunu giriniz: ");
        kim = input.nextInt();
        if(kim<0 || kim>100){
            kim =0;
        }

        System.out.print("Müzik notunu giriniz: ");
        müz = input.nextInt();
        if(müz<0 || müz>100){
            müz =0;
        }

        double ortalama = (mat+fiz+tür+kim+müz)/5;
        System.out.println("Ortalama: "+ortalama);
        System.out.println("Gecme notu: 55.0");
        if(ortalama<=55){
            System.out.println("Ögrenci sinifi gecememistir.");
        }else{
            System.out.println("Ögrenci basarili bir sekilde gecmistir");
        }

    }


}
