/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package produtoEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;


/**
 *
 * @author Reinaldo Dias
 */
public class PooIntroducao {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();
        Scanner read = new Scanner(System.in);
        Produto oper = new Produto();
        
        while(true){
        
        System.out.println("------ Seja Bem vindo----");
        System.out.println("1) Cadastrar um novo produto");
        System.out.println("2) Comprar um produto");
        System.out.println("3) Remover produtos");
        System.out.println("4) Mostrar estoque");
        int op = read.nextInt();
        
            switch(op){
                case 1:
                    produtos.add(oper.cadastro(read,produtos.size()));
                    break;
                case 2:
                    oper.Listar_Produto(produtos);
                    Produto buy = oper.pesquisar_Produto(produtos);
                    oper.compra(buy, read);
                    break;
                case 3:
                    Produto delete = oper.pesquisar_Produto(produtos);
                    produtos.remove(delete);
                    break;
                case 4:
                    oper.Listar_Produto(produtos);
                    break;
            }
        }      
    }
}
