package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArrayTKRR {
    public static void main(String[] args) {

        String elements [][] = new String [3][2];
        elements [0][0] = "a";
        elements [0][1] = "b";
        elements [1][0] = "c";
        elements [1][1] = "d";
        elements [2][0] = "e";
        elements [2][1] = "f";

        //System.out.println(Arrays.deepToString(elements));

        //System.out.println(elements[1][1]);

        //System.out.println(Arrays.toString(elements[1]));

        String students [][] = {{"ahmet", "veli"},{"ali", "murat" , "mehmet"},{"yusuf"}};

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int studentsNum = 0;

        for (String [] w : students){
            studentsNum= studentsNum + w.length;
        }
        //System.out.println(studentsNum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

        for (String [] w : students){
            for (String w1: w){
                if (w1.contains("m")){
                    //System.out.println(w1);
                }
            }

        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result = 1;
        for (int[] w:nums) {
            for (int w1: w) {
                result = result *w1;

            }}
        //System.out.println(result);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz----




    }//main
}//class
