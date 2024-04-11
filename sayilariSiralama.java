/*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. */
import java.util.Scanner;
public class sayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen sayilari büyükten küçüğe siralamasi uygulamasina hos geldiniz.");
        int n1,n2,n3;

        System.out.print("Birinci sayinizi giriniz: ");
        n1 = input.nextInt();

        System.out.print("Ikinci sayinizi giriniz: ");
        n2 = input.nextInt();

        System.out.print("Ücüncü sayinizi giriniz: ");
        n3 = input.nextInt();

        if(n1<n2 && n1<n3){
            if(n2<n3){
                System.out.println(n1+"<"+n2+"<"+n3);
            }else if(n2>n3){
                System.out.println(n1+"<"+n3+"<"+n2);
            }
        }else{
            if(n2>n3){
                System.out.println(n3+"<"+n2+"<"+n1);
            }else if(n3>n2){
                System.out.println(n2+"<"+n3+"<"+n1);
            }
        }
    }
}
