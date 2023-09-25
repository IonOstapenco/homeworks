package homework2;
/*1. Elaborati un program ce va avea urmatorul output:

 *** INTRARE IN PROGRAM ***

     Introduceti numele: //Ion
     Introduceti familia: //Munteanu
     Introduceti varsta: //78

     Nume: Ion
     Familie: Munteanu
     Varsta: 78

 *** IESIRE DIN PROGRAM ***

(unde numele este scris in 2 variabile diferite, iar
varsta este de asemenea inscrisa intr-o variabila).*/

import java.util.Scanner;

public class Exercitiu1 {
    public static void main(String[] args) {
        System.out.println("*** INTRARE IN PROGRAM ***");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String nume, familia;
        int varsta;
        System.out.println("Introduceti numele:");
        nume = sc.nextLine();
        System.out.println("Introduceti familia:");
        familia = sc.nextLine();
        System.out.println("Introdu varsta:");
        varsta = sc.nextInt();
        System.out.println("Nume: " + nume);
        System.out.println("Familie: " + familia);
        System.out.println("Varsta: " + varsta);
        System.out.println("*** IESIRE IN PROGRAM ***");

    }
}
