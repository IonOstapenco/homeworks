import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number= sc.nextInt();
        int fact = 1;
        int i=1;
        //factorial cu while
        while (i <=number){
            fact = fact * i;
            i ++;
        }
        System.out.println(fact);

    }
}
