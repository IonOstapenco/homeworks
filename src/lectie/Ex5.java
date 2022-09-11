package lectie;
import  java.util.Scanner;
//5. написать метод, вычисляющий среднее арифметические числа от 1 до 50.
public class Ex5 {
    public static void average (double min, double max){
        double count = 0;
        double sum = 0;
        if(min >=1 && max <=50){
            for (double i=min; i<=max; i++){
                count++;
                sum+=i;
            }

        }
        System.out.println("average is "+sum/count);
    }
    public static void main(String[] args) {
        System.out.println("average from 1 to 50");
        Scanner sc = new Scanner(System.in);

        double min;
        while (true) {
            System.out.println("enter min number from 1 to 50");
            min = sc.nextDouble();
            if (min < 1) {
                System.out.println("wrong! enter min number again");
            } else if (min > 50) {
                System.out.println("wrong! enter min number again");
            } else {
                break;
            }
        }
        double max;
        while (true) {

            System.out.println("enter max number from 1 to 50");
            max = sc.nextDouble();
            if (max < 1) {
                System.out.println("wrong! enter max number again");
            } else if (max > 50) {
                System.out.println("wrong! enter max number again");
            } else {
                break;
            }
        }
        average(min, max);


    }
}
