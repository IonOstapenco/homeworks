package lectie;
import java.util.Scanner;

public class Ceva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calcul venit net...");
        System.out.println("introdu venit ...");
        int totalVenit = sc.nextInt();
        System.out.println("introdu procent");
        int taxaProcent = sc.nextInt();

        //cream obiect
        Venit venit = new Venit();
        venit.taxaProcent= taxaProcent;
        venit.totalVenit= totalVenit;
        venit.CalculNetVenit();
        System.out.println("venit net "+ venit.getNetVenit());

    }
    }
     class Venit{
        public int totalVenit;
        public int taxaProcent;
        //facem privat
        private int netVenit;

        public void CalculNetVenit(){
            int a = this.totalVenit;
            int b = this.taxaProcent;
            this.netVenit = a - a*b/100;
        }
        public int getNetVenit(){
            return netVenit;
        }


    }


