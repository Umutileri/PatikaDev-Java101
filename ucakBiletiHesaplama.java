import java.util.Scanner;

public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yol,yaş,yön;
        System.out.println("\tUçak Biletinizi Hesaplayiniz");
        System.out.println("Indirim Tutarlari:\n0-11 Yas %50\n12-24 Yas %10\n65+ Yas %30");
        System.out.println("Gidis-Dönüs Bileti %20");

        System.out.print("\nGidilecek mesafeyi KM cinsinden giriniz: ");
        yol = input.nextInt();
        
        
        System.out.print("\nYasinizi Giriniz: ");
        yaş = input.nextInt();

        System.out.print("\n1- Tek Yön\n2- Gidis-Dönüs\nYolculugunuz nasil olucak[1-2]: ");
        yön = input.nextInt();
        double mesafe=0.10;
        double indirim1 = 1;
        double yönIndirimi = 1;
        double normalTutar=yol*mesafe;
        if((yol>0 && yaş>0)&&(yön==1||yön==2)){
            if(yaş<12){
                indirim1= 0.50;
            }else if(12<=yaş && yaş<=24){
                indirim1=0.10;
            }else if(yaş>=65){
                indirim1=0.30;
            }else if(yaş>24 && yaş<65){
                indirim1=0;
            }
            Double yasIndirimi = normalTutar*indirim1;
            double yasliTutar = normalTutar-yasIndirimi;
            if(yön==1){
                System.out.println("Toplam tutariniz: "+yasliTutar);
            }else if(yön==2){
                yönIndirimi = 0.20;
                double yönIndirimliTutar = yasliTutar*yönIndirimi;
                double toplamTutar = yasliTutar-yönIndirimliTutar;
                System.out.println("Toplam tutariniz: "+ toplamTutar*2);
            }
            
        }else{
            System.out.println("Hatali veri girdiniz!");
        }
    }    
}
