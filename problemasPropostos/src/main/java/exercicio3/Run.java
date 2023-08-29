/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Dias
 */
public class Run {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Aluno estudante = new Aluno();
        Double notas[]= new Double[3];
        System.out.print("Nome: "); estudante.setNome(read.nextLine());
        System.out.println("Notas");
        for(int i=0;i<3;i++){
            System.out.print("N" + i + "=");
            notas[i] = read.nextDouble();
            if(i==0 && notas[i]>30){
                notas[i]=30.0;
            }
            if(i>0 && notas[i]>35){
                notas[i]=35.0;
            }
        }
        estudante.setNotas(notas);
        double soma=0.0;
        for(double valor: estudante.getNotas()){
            soma+=valor;
        }
        if(soma>=60){// 60% de 90
            System.out.println("Final GRADE =" + soma +"\nPASS");        
        }else{
            System.out.println("Final GRADE =" + soma + "\nFAILED" + "\nMISSING " + (60-soma) + " POINTS");
            
        }
        
    }
}
