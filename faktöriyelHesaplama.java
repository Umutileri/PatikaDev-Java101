import java.util.Scanner;
public class faktöriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        int sum=1;
        String cevap;


        do{
            System.out.print("Faktöriyelini hesaplamak istediginiz sayiyi giriniz: ");
            number = input.nextInt();
            for(int i=1;i<=number;i++){
                sum*=i;
            }System.out.println("Faktöriyel="+sum);
            
            input.nextLine();
            System.out.println("Devam etmek ister misinz[evet/hayir]: ");
            cevap = input.nextLine();

        }while(cevap.equals("evet"));
}
}
