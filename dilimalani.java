/*Dairenin Alanını ve Çevresini Hesaplayan Program

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360 */
import java.util.Scanner;
public class dilimalani {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int r;
        double pi,a,o;
        pi = 3.14;

        System.out.print("Daire diliminin yari çapini giriniz: ");
        r = input.nextInt();

        System.out.print("Daire diliminin açisini giriniz: ");
        o = input.nextDouble();

        a = (pi*r*r*o)/360;

        System.out.println("Daire diliminin alani : "+ a);


     }


}
