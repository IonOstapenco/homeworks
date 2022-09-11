import java.util.Scanner;
public class Ex4 {
    //4. написать программу, которая запрашивает как вас зовут, а затем выводит "привет"  -  ваше имя.
    static void nume(String n){

        System.out.println("hello "+n);
    }

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        name=sc.nextLine();
        nume(name);

    }
}
