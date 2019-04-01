package com.codegym;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String display() {
        return "Equation is:  " + this.a + "*x*x + " + this.b + "*x + " + this.c + " = 0.";
    }

    public String displayRoots() {
        double dental = b*b -4*a*c;
        if (dental > 0.0){
            double x1 = (-b + Math.sqrt(dental))/(2*a);
            double x2 = (-b - Math.sqrt(dental))/(2*a);
            return "Equation has tow roots is: x1 = " + x1 + ", x2 = " + x2;
        }
         else if (dental == 0.0){
            return "equation has one roots is: x =" + (-b)/(2*a);
        }
         else return "equation has not real roots";

    }
}
