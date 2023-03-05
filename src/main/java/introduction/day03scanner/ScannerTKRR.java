package introduction.day03scanner;

import java.util.Scanner;

public class ScannerTKRR {
    public static void main(String[] args) {

        //1. adim: scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);
        // 2. adim: kullaniciya ne istediginize dair masaj veriniz
        System.out.println("please enter your name");
        // 3.adim: uygun methodu kullanarak kullanicinin verdigi datayi memoriye yerlestirin
        String name = input.nextLine();
        System.out.println(name);
        // kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
        System.out.println("Please enter your name");
        String isim1 = input.next();
        System.out.println("Please enter your surname");
        String soyIsim1 = input.next();
        System.out.println(isim1+" "+soyIsim1);
        // kullanicidan adressini aliniz ve ekrana yazdiriniz
        System.out.println("please enter your address");
        input.nextLine();
        String adress1 = input.nextLine();
        System.out.println(adress1);
        // kullaniciden 2 sayi alip dort islem yapin ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        System.out.println("plese enter first number");
        double firstNumber = input.nextDouble();
        System.out.println("plese enter second number");
        double secondNumber = input.nextDouble();
        System.out.println("Add : =" + (firstNumber+secondNumber));
        System.out.println("Subtract : =" + (firstNumber-secondNumber));
        System.out.println("Multiply : =" + (firstNumber*secondNumber));
        System.out.println("Divide : =" + (firstNumber/secondNumber));
        // kullanicidan bir dortgeninin iki kenar uzunlugunu aliniz
        // 1. alanini hesaplayiniz kisa kenar * uzun kenar
        // 2. cevresini hesaplayiniz 2* kisakenar+2*uzunkenar
        System.out.println("please enter short side of the rectangle");
        double shortSide1 = input.nextDouble();
        System.out.println("please enter long side of the rectangle");
        double longSide1 = input.nextDouble();
        System.out.println("area : = "  +(shortSide1*longSide1));
        System.out.println("perimeter : = "  +(shortSide1*2 + longSide1*2));



    }//main
}//class
