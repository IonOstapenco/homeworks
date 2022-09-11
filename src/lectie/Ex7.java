package lectie;
//7. создать, заполнить и вывести массив из 10 целых чисел
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("create array from 10 integers");
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("enter number for array");
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
            if (i%1!=0){
                System.out.println("wrong number! enter again");
            }
            else {
                break;
            }
        }
        System.out.println("your array is");
        for (int i=0; i< array.length; i++){
            System.out.print(" "+array[i]+ " ");
        }
    }
}
