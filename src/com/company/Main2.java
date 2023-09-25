package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu numele");
        String nume = sc.nextLine();
        System.out.println("introdu patronimicul");
        String patronim = sc.nextLine();
        System.out.println("introdu familia");
        String familia = sc.nextLine();
        System.out.println(" te numesti "+nume+ " "+patronim+ " "+familia);

    }
}
