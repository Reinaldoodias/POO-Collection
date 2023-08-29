/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Dias
 */
public class Run {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter rectangle width and height:");
        double width = read.nextDouble();
        double height = read.nextDouble();
        
        Retangulo ret = new Retangulo();
        ret.setA(width);
        ret.setB(height);
        System.out.println("AREA: " + ret.area(ret.getA(), ret.getB()));
        System.out.println("PERIMETER: " + ret.perimetro(ret.getA(), ret.getB()));
        System.out.println("DIAGONAL: " + ret.diagonal(ret.getA(), ret.getB()));
    }
}
