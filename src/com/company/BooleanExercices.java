package com.company;

public class BooleanExercices {
    public static void main(String[] args) {
        int x = 5;
        String name = "Cutit";

        if (x == 20) {
            System.out.println("x trebuie sa fie egal cu 20");
        } else {
            System.out.println(" x nu este egal cu 10");
        }
        if ((x < 3) & (name.equals("Cutit"))) {
            System.out.println("fii atent");
        }
        System.out.println("Aceasta linie de cod se executa oricum");
    }
}
