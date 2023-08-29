/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

/**
 *
 * @author Reinaldo Dias
 */
public class CurrentConverter {
    public static final double IOF = 0.06;
    
    public static double conversao(double preco, double quant){
        return (preco*quant)+(IOF*(quant*preco));
    }
}
