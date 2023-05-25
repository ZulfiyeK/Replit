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



}

}
