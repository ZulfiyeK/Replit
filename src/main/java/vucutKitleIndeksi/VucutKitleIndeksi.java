package vucutKitleIndeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
           BMI = Agirlik(kg) / Boy*Boy (m)

          BMI 18,5'in altındaysa zayıfsınız,
          BMI 18,5 ile 25 arasında ise kilonuz idealdir,
          BMI 25-30 arasındaysa şişmansınız,
          BMI 30'dan büyük veya eşitse, obez, yazdiriniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double agirlik = input.nextDouble();

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double boy = input.nextDouble();

        double bmi = agirlik/(boy*boy);
        System.out.println(bmi);

      //1. yol "if()" ile
        if(bmi<18.5){
            System.out.println("Zayifsiniz");
        } else if (bmi<=18.5||bmi<=25) {
            System.out.println("Kilonuz ideal");
        }else if(bmi>25||bmi<=30){
            System.out.println("Sismansiniz");
        } else if (bmi>30) {
            System.out.println("Obezsiniz");
        }



    }
}
