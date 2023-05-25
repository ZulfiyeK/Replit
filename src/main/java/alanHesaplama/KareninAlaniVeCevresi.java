package alanHesaplama;

import java.util.Scanner;

public class KareninAlaniVeCevresi {
    public static void main(String[] args) {


  //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen kenar uzunlugu giriniz");

    int kenar= scan.nextInt();

    System.out.println("Karenin Alani: " + (kenar * kenar));
    System.out.println("Karenin Cevresi: " + (4 * kenar));

}
}