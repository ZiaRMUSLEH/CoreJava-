package introduction.day03scanner;
// javanin util kutuphanesinden scanner class import edildi demektir
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
      //1. adim: scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);
        // object ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlari icine koyacak
        // system.in yani disaridan al
        // system.out yani disariya ver (print yap)

        // 2. adim: kullaniciya ne istediginize dair masaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        // 3.adim: uygun methodu kullanarak kullanicinin verdigi datayi memoriye yerlestirin
        byte age= input.nextByte();
        System.out.println(age);


    }
}
