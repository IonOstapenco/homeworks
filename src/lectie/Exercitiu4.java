package lectie;
/*2.
*/
public class Exercitiu4 {
    public static int sum(int a, int b){
        return a+b;
    }
    //Creati o metoda care calculeaza si afiseaza suma tuturor numerelor de la 0< n (n sa fie dinamic: ca argument).
    //De ex. n=5 - suma pina la 5 este 10
    public static int suma(int c){
        int s=0;
        for (int i=0; i<c; i++){
            s+=i;
        }
        return s;
    }
    //3. Creati o metoda care afiseaza toate cifrele pare pina la un nr n (n sa fie dinamic: ca argument).
    //De ex. n=5, cifrele pare pina la 5 sunt 0,2,4
    public static int numPare(int d){
        for (int i=0; i<d; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        return d;
    }
    //4. Creati o metoda care afiseaza la ecran "Hello" de 10 ori
    public static String salutare(String sal){
        for (int i=0; i<10; i++){
            System.out.println(sal);
        }
       return sal;
    }
    //5. Creati o metoda care afiseaza toate cifrele impare pina la un nr n (n sa fie dinamic: ca argument).
    //De ex. n=5, cifrele pare pina la 5 sunt 1,3*/
    public static int numImpare(int d){
        for (int i=0; i<d; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
        return d;
    }
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(sum(5,4));
        System.out.println("suma tuturor numerelor de la 0< n este "+suma(5));
        System.out.println("cifrele pare pina la un nr n = " +numPare(5));
        System.out.println(salutare(s));
        System.out.println("cifrele impare pina la un nr n = " +numImpare(5));
    }
}
