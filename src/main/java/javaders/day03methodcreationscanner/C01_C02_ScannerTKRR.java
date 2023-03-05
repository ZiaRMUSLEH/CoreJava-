package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_C02_ScannerTKRR {
    public static void main(String[] args) {
      /*  // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini soran bir program yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender = input.next();

        System.out.println("please enter your name");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("please enter your country");
        String country = input.next();

        System.out.println("please enter your age");
        byte age = input.nextByte();

        System.out.println("please enter your height");
        int height = input.nextInt();

        System.out.println("please enter your true if you love your country or false if you don't'");
        boolean country1 = input.nextBoolean();



        System.out.println("gender = " + gender);
        System.out.println("name = " + name);
        System.out.println("country = " + country);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("country1 = " + country1);

       */


        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
        //ekrana yazdiran programi yaziniz

        Scanner input = new Scanner (System.in);
        System.out.println("please enter a four digit number");
        int number = input.nextInt();
        int firstDigit = number%10;
        int LastDigit = number/1000;
        System.out.println(firstDigit+LastDigit);





    }//main
}//class
