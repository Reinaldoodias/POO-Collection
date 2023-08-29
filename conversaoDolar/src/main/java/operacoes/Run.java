/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operacoes;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Dias
 */
public class Run {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("What id the dollar price? ");
        double price = read.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantidade = read.nextDouble();
        System.out.println("Amount to be paid in reais = " + CurrentConverter.conversao(price, quantidade));
    }
}
