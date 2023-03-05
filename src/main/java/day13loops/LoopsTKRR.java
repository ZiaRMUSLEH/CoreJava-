package day13loops;

public class LoopsTKRR {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for ( int i = 21;  i<181 ; i++ ){
            if (i%4==0 && i%6==0){
                //System.out.println(i);
            }
        }


        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        for ( int i =0; i<s.length() ;i++ ){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                //System.out.print(ch.toUpperCase());
            } else {
                //System.out.print(ch);
            }
        }

        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
         String s1 = "Hello Java";
         for (int i =0; i<s1.length() ;i++){
            char ch = s1.charAt(i);
             if (ch == 'a'){
                 break;
             } else {//System.out.print(ch);
         }}
        //System.out.println();

        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci ==> ict

        String s2 = "Tokatci";
        for (int i1 = s2.length()-1;i1>=0 ;i1--){
            char ch = s2.charAt(i1);
            if (ch == 'a'){break;}
            else{
            //System.out.print(ch);}
        }}


        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String pwd = "Pwd12?Ab";
        for (int i2 = 0;i2<pwd.length();i2++){
            char ch2 = pwd.charAt(i2);
            if (ch2 >= 'a' && ch2<= 'z' ){
                continue;
            }else {
                //System.out.print(ch2);
            }
        }

        //System.out.println();
        // Bir String'i ters ceviren kodu yaziniz
        //1. way
        String t = "Java";
        String ters = "";
        for (int i=t.length()-1;i>=0;i--){
            char ch6 = t.charAt(i);
            String toTers = (ch6+ters);
        }
        //System.out.println(ters);
        //2.Way:
        for (int i = t.length()-1; i>=0; i--){
            char ch7 = t.charAt(i);
            //System.out.print(ch7);
        }

        // Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz---
        // 578 ==> 5+7+8 = 20
        int i5 = -587;
        i5 = Math.abs(i5);

        int result = 0;
        for (int i = 578;i>0 ;i=i/10 ){


                    result =result+i%10;
        }
        System.out.println(result);





    }//main
}//class

