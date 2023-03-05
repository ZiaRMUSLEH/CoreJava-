package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    // kullanicidan adressini aliniz ve ekrana yazdiriniz
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen Adresinizi Giriniz");
        // next() methodu kullancidan tek kelimeli stringi almak icin kullanilir
        // next line() methodu ise kullaniciden cok kelimeli stringi almak icin kullanilr

        String address = input.nextLine();

        System.out.println(address);

    }
}
