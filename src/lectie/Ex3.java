package lectie;
//3. написать метод, который выводит на экран надпись "молодой" если
// введённый возраст <30, если >30 <60 "средний возраст" >=60 "пожилой"

import  java.util.Scanner;
public class Ex3 {
    //programa cu varsta
    public static void ageDefinition(int age){
        if (age<0){
            System.out.println("error prea putin");
        }
        if (age>160){
            System.out.println("prea mult");
        }
        if (age<30){
            System.out.println("tanar");
        }
        if (age>30 && age<60){
            System.out.println("adult");
        }

        if (age>=60){
            System.out.println("batran");
        }
    }

    public static void main(String[] args) {
        System.out.println("введи возраст");
        Scanner sc = new Scanner(System.in);
        int v= sc.nextInt();
        ageDefinition(v);

    }
}
