/*Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */
import java.util.Scanner;

public class bölünenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        double sum=0;
        double ort=0;
        double count=0;
        for(int i=1; i<=number;i++){
            if(i%3==0 && i%4==0){              
                ort +=i;
                count++;
            } 
        } System.out.println(ort/count);
        

    }
}
