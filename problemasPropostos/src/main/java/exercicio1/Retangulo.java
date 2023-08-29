/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author Reinaldo Dias
 */
public class Retangulo {
    private double a;
    private double b;

    public Retangulo() {
        this.a = 0;
        this.b = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double area(double a, double b){
        return a*b;
    }
    public double perimetro(double a, double b){
        return a*2 + b*2;
    }
    public double diagonal(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
}
