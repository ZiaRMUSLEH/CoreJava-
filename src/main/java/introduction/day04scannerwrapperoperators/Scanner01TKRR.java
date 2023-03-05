package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01TKRR {
    public static void main(String[] args) {

        //Kullanicidan alacagınız 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazidiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a five digit number");
        int number = input.nextInt();

        int frst = number%10;
        int snd = number/10%10;
        int frth = number/1000%10;
        int ffth = number/10000;

        System.out.println(frst+snd+frth+ffth);



    }//mian
}//class
