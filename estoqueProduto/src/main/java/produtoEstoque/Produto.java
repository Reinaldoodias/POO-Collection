
package produtoEstoque;

import java.util.List;
import java.util.Scanner;

/**
 *Classe com atributos e métodos de um produto
 * @author Reinaldo Dias
 */
public class Produto {
    private String nome;
    private int code;
    private double preco;
    private int quantidade;
    private double total;

    public Produto() {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = getPreco() * getQuantidade();
    }
    

    @Override
    public String toString() {
        return "Produto{" + "nome=" + this.nome + ", preco=" + preco + ", quantidade=" + quantidade + ", código=" + this.code + ", Total=" + this.total + '}';
    }
  
    public static Produto cadastro(Scanner aux,int code){
        Produto novoProduto = new Produto();
        System.out.println("<Informe o nome>");
        aux.nextLine();
        String nome = aux.nextLine();
        novoProduto.setNome(nome);
        System.out.println("<Informe o Preço>");
        double preco = aux.nextDouble();
        if(preco>0){
            novoProduto.setPreco(preco);
        }else{
            System.out.println("Preço INVÁLIDO!(menor que 0)");
            return cadastro(aux,code);
        }
        System.out.println("<Informe a quantidade>");
        int quantidade = aux.nextInt();
        if(quantidade>0){
            novoProduto.setQuantidade(quantidade);
        }else{
            return cadastro(aux,code);
        }
        novoProduto.setCode(code);
        novoProduto.setTotal();
        return novoProduto;
    }
    
    public void compra(Produto atual, Scanner aux){
        System.out.println("<informe a quantidade>");
        int quantidade = aux.nextInt();
        if((atual.getQuantidade() - quantidade)>=0){
            atual.setQuantidade(atual.getQuantidade()-quantidade);
            atual.setTotal();
        }
        System.out.println("Valor da compra: " + quantidade*atual.getPreco());
    }
    
    public void Listar_Produto(List<Produto> lista){
        int con =0;
        while(con<=lista.size()-1){
            System.out.println(lista.get(con).toString());
            con++;
        }
    }
    
    public Produto pesquisar_Produto(List<Produto> lista){
        Scanner aux = new Scanner(System.in);
        System.out.println("<Informe o codeproduto>");
        int code = aux.nextInt();
        for(int i=0;i<=lista.size()-1;i++){
            if(lista.get(i).getCode()==code){
                return lista.get(i);
            }
        }
        return null;
    }
    
}
