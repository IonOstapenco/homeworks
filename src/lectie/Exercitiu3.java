package lectie;
/*1. Sa creati o clasa si in ea sa aveti 4 proprietati de tipuri diferite,
  1.1 o metoda care returneaza si primeste ca parametru un nr intreg
  1.2 o metoda care primeste 2 parametri de tip string si nu returneaza nimic
  1.3  o metoda care nu primeste nici un parametru si returneaza un string
  1.4  o metodata care primeste ca parametru un char si returneaza char-ul primit ca numar intreg.
Toate metodele le chemati intro alta clasa dupa ce creati obiecte cu valori la proprietati.*/
public class Exercitiu3 {
    String name;
    String bautura;
    int age;
    String bucate;
    char ceva;


    public void spune(){
        System.out.println("ceva");
    }
    //1.1 o metoda care returneaza si primeste ca parametru un nr intreg
    public int getAge(int age) {
        return age;
    }
    //1.2 o metoda care primeste 2 parametri de tip string si nu returneaza nimic
    public void feed(String bautura, String bucate){

    }
    //1.3  o metoda care nu primeste nici un parametru si returneaza un string
    public String getName() {
        return name;
    }
    //1.4  o metodata care primeste ca parametru un char si returneaza char-ul primit ca numar intreg.
    public char getCeva(char ceva){
        return ceva;
    }
}
