package javaders.day06typecastingstringmanipulation;

import java.util.Scanner;

public class MiniProjects {
    public static void main(String[] args) {


        //System.out.println("proje 1");
        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = "599.99$";
        //String laptop = "299.99$";
        //String tv1 = tv.replace("$", "");
        //String laptop1 = laptop.replace("$", "");
        //double sum = Double.valueOf(tv1)+Double.valueOf(laptop1);
        //System.out.println("total of tv and laptop = " + (sum) + "$");




        //System.out.println("proje 2");
        //String tamIsim = "  mehmet fatih  ";
        // Verilen tamIsim String'inin icindeki ilk ismin
        // ilk harfiyle son ismin ilk harfini buyuk harf
        // olarak yan yana yazdiriniz    ==>MF
        //char ilkIsminIlkHarfi = tamIsim.toUpperCase().trim().charAt(0);
        //char sonIsminIlkHarfi = tamIsim.toUpperCase().trim().split(" ")[1].charAt(0);-------------

       //char sonIsminIlkHarfi = tamIsim.toUpperCase().trim().charAt(tamIsim.trim().indexOf(" ")+1);
        //System.out.println("sonuc: "+ilkIsminIlkHarfi+sonIsminIlkHarfi);

        System.out.println("proje 3");
        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                i) En az 8 karakterden olussun
                ii)Password space icermesin
                iii)En az 1 tane buyuk harf olsun
                iv) En az 1 tane kucuk harf olsun
                v) En az 1 tane sembol olsun
                vi) En az 1 tanede rakam olsun
                */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a password key ass below " +
                "i) En az 8 karakterden olussun\n" +
                "ii)Password space icermesin\n" +
                "iii)En az 1 tane buyuk harf olsun\n" +
                "iv) En az 1 tane kucuk harf olsun\n" +
                "v) En az 1 tane sembol olsun\n" +
                "vi) En az 1 tanede rakam olsun ");
        String pwd = input.nextLine();
        //i) En az 8 karakterden olussun
        boolean chSayisi = pwd.length() > 7;
       // ii)Password space icermesin
        boolean space = pwd.contains(" ");

        //iii)En az 1 tane buyuk harf olsun
        //iv) En az 1 tane kucuk harf olsun
        //v) En az 1 tane sembol olsun
        //vi) En az 1 tanede rakam olsun




        System.out.println("proje 4");
         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */


    }//main  git config --global user.password "z6136789."
    //       git config --global user.name "ZiaRMUSLEH"
}//class     z6136789.
