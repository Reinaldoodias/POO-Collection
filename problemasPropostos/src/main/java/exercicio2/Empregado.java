/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;


/**
 *
 * @author Reinaldo Dias
 */
public class Empregado {
    private String nome;
    private double salario;
    private double imposto;

    public Empregado() {
        this.nome = null;
        this.salario = 0;
        this.imposto = 0;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void reajuste(double porcentagem){
        System.out.println(liquido() + getSalario()*(porcentagem/100));
    }
    public double liquido(){
        return getSalario()- getImposto();
    }
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", R$" + liquido() +'}';
    }
    
    
    
}
