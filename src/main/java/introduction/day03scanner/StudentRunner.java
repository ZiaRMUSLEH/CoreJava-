package introduction.day03scanner;

public class StudentRunner {
    public static void main(String[] args) {


        Student student = new Student();

        System.out.println(student.address);
        System.out.println(student.grade);
        System.out.println(student.name);

        student.feed();
        student.study();

    } //main

}//class
