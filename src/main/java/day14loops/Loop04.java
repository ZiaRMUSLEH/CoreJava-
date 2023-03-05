package day14loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {

        //Kullanici username ve password'u girsin.
//3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
//3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
//Dogru girerse "Welcome to your account" mesaji alsin
        Scanner input = new Scanner(System.in);

        int counter = 0;
        String validUsername = "techpro123";
        String validPassword = "Education12?";

        do {
            if (counter == 3) {
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("please enter your username ");
            String username = input.next();
            System.out.println("please enter your password");
            String password = input.next();

            counter++;

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Welcome to your account");
                break;
            } else {
                System.out.println("Invalid username or password, try again");
                System.out.println((3-counter)+"Invalid username or password, try again");
            }
        } while (true) ;

        }//main
    }//class
