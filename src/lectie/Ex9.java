package lectie;
import java.util.Scanner;

import java.util.Scanner;
//9. написать метод определяющий, является ли введённое пользователем число типа double или целым.
public class Ex9 {
    public static void Define(double a){
        if(a%1==0) {
            System.out.println("is integer");
        } else {
            System.out.println("is double");
        }
    }
    public static void main(String[] args) {
        System.out.println("int or double");
        System.out.println("enter number for verification");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        Define(number);
    }
}
