package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    // kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
    public static void main(String[] args) {

        // 1. adim: scanner classtan object olusturun
        Scanner input = new Scanner(System.in);

        // 2. adim: kullaniciya ne istedigimize dair mesaj verniz
        System.out.println("ilk isminizi giriniz");
       String firstName =  input.next();
        System.out.println("soy isminizi giriniz");
       String lastName = input.next();
        System.out.println(firstName+" "+ lastName);

    }
}
