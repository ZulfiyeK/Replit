package usAlma;

import java.util.Scanner;

public class UsAlma {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen sayıyı giriniz:");

    double sayi,us;
    sayi = input.nextDouble();//2

    System.out.println("Lütfen üssü giriniz:");
    us = input.nextDouble();//3

    System.out.println("Math.pow(sayi,us) = " + Math.pow(sayi,us));//8.0



    //2. Yol
    //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir kod yazın.

    System.out.println("Lutfen bir sayi giriniz");
    double num= input.nextDouble();

    System.out.println((num*num*num)/2);

}

}
