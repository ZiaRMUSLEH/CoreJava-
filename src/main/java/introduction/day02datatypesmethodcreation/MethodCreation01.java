package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {

        /*
        java'da method nasil olusturulur
        1)main method'un disinda classin icinde olusturulur
        2)Access Modifier + return type + Method ismi+ () + {}

        Olusturulan methadlar nasil kullanilir?
        1)main method'un icinden kullanilir
        2)method'un ismi + () yazin
        3)islem yapacağınız parametreler parantezin icine koyulur
        ==>main method static oldugu icin main method icerisinde kullanacağınız her sey static olmalidir.
         */
        public static void main(String[] args) {

            int sonuc =  toplamaYap(30,60);
            System.out.println(sonuc);

            long carpmaSonuc = multiply(3,5);
            System.out.println(carpmaSonuc);

            int ucluSonuc = firstTowMultiplyThirdAdd (2, 5, 8);
            System.out.println(ucluSonuc);

            double kup = getCube (3.5);
            System.out.println(kup);

            print ("Hello World");





        }
        //Ornek1:toplama islemi yapan bir method olusturunuz.
        public static int toplamaYap (int a, int b){

            return a+b;
        }

        //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
        protected static long multiply(int a, int b){
            return a*b;
        }

        //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.

        private static int firstTowMultiplyThirdAdd (int a, int b, int c) {
            return a*b+c;
        }

        //Ornek 4: Verilen bir ondalikli sayinin kupunu hesaplayan method olusturup kullaniniz.
        // Note: Access modifier'i default yapmak isterseniz access modifier yazmayiniz

        static double getCube (double a) {
            return a*a*a;
        }

        //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
        //eger bir method yeni bir data uretmiyor ise return typi void olur
        //methodun return type'i void ise method body icinde return keyword yazilmaz

    public static void print (String str) {
        System.out.println(str);
    }




    }
