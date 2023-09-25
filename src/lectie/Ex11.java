package lectie;
//11. Написать программу, которая будет выводить таблицу умножения для введённого пользователем числа с клавиатуры.
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("tabla inmultirii al unui numar");
        Scanner sc = new Scanner(System.in);
        //nr pentru inmultire
        System.out.println("scrie nr care trebuie inmultit");
        int number = sc.nextInt();

        //2d array pentru tabla inmultirii + operatiune
        System.out.println("tabla inmultirii a numarului "+number+ "este");
        System.out.println();
        int[][] tabla = new int [10][10];
        for (int i=1; i<= tabla.length;i++){
            //System.out.print(number*i);
            //System.out.print(number + " x "+ i +" = "+ number*i);
            for (int j=1; j<= tabla.length; j++){
                //System.out.print(number + " x "+ i +" = "+ number*i);
            }
            System.out.print(number + " x "+ i +" = "+ number*i);
            System.out.println();
        }
    }
}
