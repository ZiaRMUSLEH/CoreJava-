package introduction.day02datatypesmethodcreation;

public class MethodCreation01TKRR {
    public static void main(String[] args) {

        //Ornek1:toplama islemi yapan bir method olusturunuz.
        //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
        //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.
        //Ornek 4: Verilen bir ondalikli sayinin kupunu hesaplayan method olusturup kullaniniz.
        //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

        int result = toplama(4,5);
        System.out.println(result);

        int result1 = multiply(5,6);
        System.out.println(result1);


        int result2 = addMultiply(4,7,9);
        System.out.println(result2);

        getCube(5);

        textWriter("it's very easy to learn java");

    }//main

    private static void textWriter (String a) {
        System.out.println(a);
    }

    public static void getCube(double a){
        System.out.println(a*a*a);
    }

    protected static int addMultiply (int a, int b, int c){
        return a*b+c;
    }



    public static int multiply (int a, int b){
        return a*b;
    }

    public static int toplama (int a, int b){
       return (a+b);
    }

}//class
