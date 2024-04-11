import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        System.out.println("\t Artik yil hesaplama uygulamasina hos geldiniz!");
        Scanner input = new Scanner(System.in);

        System.out.println("Yil giriniz: ");
        int yil = input.nextInt();

        if(yil%100==0 && yil%400==0){
            System.out.println("Artik yildir.");
        }else if(yil%100==0 && yil%400!=0){
            System.out.println("Artik yil degildir.");
        }
        else if(yil%4==0){
            System.out.println("Artik Yildir");
        }else{
            System.out.println("Artik yil degildir.");
        }
        }
}
