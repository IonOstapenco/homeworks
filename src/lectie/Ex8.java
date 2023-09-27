package lectie;
import java.util.Scanner;
//8. написать программу вычисляющую минимальный и максимальный элемент массива
public class Ex8 {
    public static void main(String[] args) {
        int size;
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array");
        System.out.println("enter array's size");
        size=sc.nextInt();
        int []array = new int[size];
        System.out.println("enter elements of array");
        for (int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("array element are: ");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        max=min=array[0];
        for (int i=1; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            } else if (array[i]<min) {
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("largest number is "+max);
        System.out.println("smallest number is "+min);
    }
}
