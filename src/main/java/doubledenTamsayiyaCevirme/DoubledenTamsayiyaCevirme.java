package doubledenTamsayiyaCevirme;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class DoubledenTamsayiyaCevirme {
    public static void main(String[] args) {

//G Verilen DOUBLE sayıyı tam sayıya çeviren bir kod yazınız.
        //Ornek 1

        double num = 115.32;
        System.out.println("num = " + num);//115.32
        int a = (int)num;
        System.out.println("a = " + a);//115



        // Ornek 2

        double num1 = 85647.68;
        System.out.println("num1 = " + num1);//85647.68

        int a1 = (int)num1;
        System.out.println("a1 = " + a1);//85647

    }
}
