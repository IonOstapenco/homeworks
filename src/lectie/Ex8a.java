package lectie;
import java.util.Scanner;
//min and max of array
public class Ex8a {
    public static void main(String[] args) {
        System.out.println("fin min and max in array");
        Scanner sc = new Scanner(System.in);
        int min, max; //elemente min si max
        System.out.println("enter array's length");
        int leng = sc.nextInt();
        int[] arr = new int[leng];
        System.out.println("enter elements in array");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("array's is ");
        //afisam array
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //stabilirea min si max din array
        min=max=arr[0];
        for (int i =0; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        //afisam min si max
        System.out.println("min element of array is "+min+" and max is "+max);
    }
}
