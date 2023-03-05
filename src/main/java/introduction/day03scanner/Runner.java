package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {

        // object nasil olusturulur?
        // class ismi + object ismi + atama operaturu + "new" + constructor
               Car        myCar         =              new    Car();

        // new  keywordu sifirdan yeni bir objet olusturmak icin kullanilir
        // construcor java da nesneleri olusturmak icin kullanlan ozel bir method dur

        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();


        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade);

    }
}
