package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    /*
   1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
  Yani; logic data'ya bagimli olmamalidir.
  Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
  "hard code" hatali kod demektir.

  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz

     */
    public static void main(String[] args) {

        // Arrayleri kisa yoldan nasil olusturabiliriz?

        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); //[67, 98, 100, 34, 76]

        //Example 1: grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades)); //[34, 67, 76, 98, 100]
        System.out.println(grades [0]+grades[grades.length-1]); //134

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w: stdNames) {
            if (w.length()<5) {
                System.out.println(w);}}

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimlerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);

        for (String w: stdNames){
            if (w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }

//Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimlerden onceki isimleri ve F ile baslayanlari console'a yazdiriniz

        Arrays.sort(stdNames);

        for (String w: stdNames){
            System.out.println(w);
            if (w.startsWith("F")){
                break;
            }
        }
        System.out.println("**********");
        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimler haric diger isimleri  console'a yazdiriniz

        Arrays.sort(stdNames);  // sort() methodu numaric datalari kucukten buyuga(ascending) dizer
                                // Stringleri ise alfabetik sirada (alphabetik) dizer
                                // ascending + alphabeticaly ==> Natural Order.

        for (String w: stdNames){

            if (w.startsWith("F")){
               continue;
            } System.out.println(w);
        }









    }//main
}//class
