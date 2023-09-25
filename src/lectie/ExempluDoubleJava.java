package lectie;

public class ExempluDoubleJava {
    public static void main(String[] args) {
        int lungime = 15, latime = 25;
        int aria;
        aria = lungime * latime;

        //calculam aria patrulaterului
        System.out.println("aria patrulaterului este de " + aria);

        //declaram variabila a tipului double care va stoca radacina patrata
        double aria_sqrt;

        //calcularea radacinii patrate a aiei patrlaterului
        aria_sqrt = Math.sqrt(aria);
        System.out.println("radacina patrata a ariei este " + aria_sqrt);
    }
}
