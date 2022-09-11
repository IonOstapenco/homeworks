import java.util.Scanner;
public class Inversare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("scrie ceva cu litere");
        String prop = sc.nextLine();
        char[] arr = prop.toCharArray();//transformare din str in arr
        for (int i= arr.length-1;i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
