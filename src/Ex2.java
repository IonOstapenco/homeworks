import java.util.Scanner;
public class Ex2 {
    //2. написать метод, который выводит сумму 2-х чисел
    //functia de adunare
    public static int sum (int n, int m){ // cu returnu
    //public static void sum (int n, int m){ // fara return
        return n + m;
        //int sum=n+m; // fara return
         //System.out.println("suma numerelor este "+sum); //fara return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("aflam suma la doua numere");
        System.out.println("introdu primul numar");
        n= sc.nextInt();
        System.out.println("introdu al doilea numar");
        m= sc.nextInt();
        //functia
        int rezult = sum(n,m); //cu rezult
        sum(n,m);
        System.out.println("suma este "+rezult);//cu return



    }
}
