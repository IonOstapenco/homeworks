package lectie;
import java.util.Scanner;
//12. Написать программу, которая будет отображать кол-во часов, минут, секунд в n-ном количестве суток (кол-во суток вводится с клавиатуры).
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many hours, minutes, seconds are there in a day");
        System.out.println("enter nr of days");
        double days = sc.nextDouble();
        double hours=days*24;
        double min = hours*60;
        double sec = min*60;
        System.out.println("hours "+hours);
        System.out.println("minutes "+ min);
        System.out.println("sec "+sec);
    }
}
