package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        // kullanicidan bir dortgeninin iki kenar uzunlugunu aliniz
        // 1. alanini hesaplayiniz kisa kenar * uzun kenar
        // 2. cevresini hesaplayiniz 2* kisakenar+2*uzunkenar

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen dortgenin kisa ve uzun kenarlarini giriniz");

        double kisakenar = input.nextDouble();
        double uzunkenar = input.nextDouble();

        System.out.println("dortgenin alani"+ " "+kisakenar*uzunkenar);
        System.out.println("dortgenin cevresi"+" "+(kisakenar*2 + uzunkenar*2));








    }
}
