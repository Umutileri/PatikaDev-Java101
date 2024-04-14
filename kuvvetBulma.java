/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
import java.util.Scanner;
public class kuvvetBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pogram tanimi:\nJava döngüler ile girilen sayiya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdiran programi yaziyoruz.");

        int sayi;
        System.out.print("Lütfen bir sayi giriniz: ");
        sayi= input.nextInt();
        for(int i=1;i<=sayi;i*=5){
            System.out.println(i);}
        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);        
    }
}
}
