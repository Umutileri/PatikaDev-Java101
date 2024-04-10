import java.util.Scanner;
public class ucgenalan {
    /*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double u,alan;
        System.out.print("Üçgenin 1. kenarini giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin 2. kenarini giriniz: ");
        b = input.nextInt();

        System.out.print("Üçgenin 3. kenarini giriniz: ");
        c = input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alani = " + alan);


     }
}
