package com.codegym;

import java.util.Scanner;

public class playQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = sc.nextDouble();
        System.out.println("enter b: ");
        double b = sc.nextDouble();
        System.out.println("enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation  equation = new QuadraticEquation(a,b,c);
        System.out.println(equation.display());
        System.out.println(equation.displayRoots());
    }
}
