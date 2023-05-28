package dakikaSaatGun;

import java.util.Scanner;

public class DakikaSaatGun {
    public static void main(String[] args) {

    /*Kullanıcıdan dakika girmesini isteyin,
    Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

    INPUT: Dakika sayısı: 3456789
    OUTPUT : 3456789 dakika yaklaşık 6 yıl 210 gündür
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dakika giriniz");
        double dakika = input.nextInt();

        double saat = 24;
        double gun = 365;
        double dakika1 = 60.0;

        double yil = (((dakika / dakika1) / saat) / gun);
        System.out.println(yil);

        //Not : henuz tamamlanmadi!!
    }
}
