package lectie;
//написать метод, который выводит на экран введённый с клавиатуры символ
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter something");
        char ceva = sc.next().charAt(0);
        if (Character.isDigit(ceva)==true){
            System.out.println("is a digit");
        }
        else if (Character.isDigit(ceva)==false){
            System.out.println("is a letter");
        }

        /*// Function to check if the character
        // is digit or not
        char c1 = 'A', c2 = '4';
        System.out.println(
                c1 + " is a digit -> "
                        + Character.isDigit(c1));
        System.out.println(
                c2 + " is a digit -> "
                        + Character.isDigit(c2));

        /*Scanner in = new Scanner(System.in);
        System.out.println("Please enter a single character: ");
        //String character = in.next();

        System.out.println(character);

        if (character.isLetter()){
            System.out.println("The character entered is a letter.");
        }
        else (character.isDigit()){
            System.out.println("The character entered is a digit.");
        */



        //***************///
      /*  System.out.println("enter something");
        Scanner sc = new Scanner(System.in);
        String something = sc.next();
        System.out.println(something);

        if (something.isDigit){

        }*/
        //public boolean isDigit(char c) {
          //  return Character.isDigit(c);
        //}
    }
}
