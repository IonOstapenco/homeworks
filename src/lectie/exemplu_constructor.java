package lectie;
//constructor
import  java.util.Scanner;
public class exemplu_constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu nume");
        String nume = sc.nextLine();
        //cream obiecte
    Venire v1 = new Venire(); // cu defaultu
    Venire v2 = new Venire(nume);

        System.out.println("cu defaultu "+v1.getActiune());
        System.out.println("cu introdus "+v2.getActiune());
    }


}
class Venire{
    private  String actiune; //vom folosi getter si setter
    //setter
    void setActiune(String actiune){
        this.actiune = actiune;
    }
    //getter
    String getActiune(){
        return actiune;
    }
    //constructori
    //constructor by default
    Venire(){
        this.setActiune("--venit--");
    }
    //constructor
    Venire(String actiune){
        this.actiune = actiune;
    }
}
