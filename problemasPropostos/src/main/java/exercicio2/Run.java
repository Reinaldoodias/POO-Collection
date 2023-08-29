/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Dias
 */
public class Run {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Empregado novo = new Empregado();
        System.out.print("Name: ");
        novo.setNome(read.nextLine());
        System.out.print("\nSalario Bruto: ");
        novo.setSalario(read.nextDouble());
        System.out.print("\nImposto: ");
        novo.setImposto(read.nextDouble());  
        System.out.println(novo.toString());
        System.out.print("Qual o percentual para aumentar o salário? ");
        double porcentagem = read.nextDouble();
        System.out.print("nome= " + novo.getNome() + ", R$"); novo.reajuste(porcentagem);
        
        
        
        
        
    }
}
