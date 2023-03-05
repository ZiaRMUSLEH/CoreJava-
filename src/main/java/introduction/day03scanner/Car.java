package introduction.day03scanner;

public class Car {
    // variableler olusturalm
    public String model = "Crolla";
    public int fiyat = 20000;

    // methodlar olusturalim
    // note: return taype void method icinde return keywordu kullanilmaz
    // eger bir mehod yeni bir data uretmiyorsa sadec belli bir islem yapiyorsa return taypi void olur

    public void hareket(){

        System.out.println("corolla hizli hareket eder...");
    }
    public void dur(){
        System.out.println("Corolla guvenli bir sekilde durur...");
    }
}
