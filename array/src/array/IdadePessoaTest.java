package array;

import java.util.Scanner;
public class IdadePessoaTest {
    public static void main(String args[]) {
    	IdadePessoa obj= new IdadePessoa(3);
    	Scanner input= new Scanner(System.in);
    	
    	System.out.println("*****INICIANDO PREENCHIMENTO DOS VETORE*****");
    	obj.Preenchimento();
    	System.out.println("*****INICIANDO MOSTRAR DOS VETORE*****");
    	obj.MostraVetores();
    	System.out.println("*****INICIANDO QtdMaioresIdades*****");
    	int qtdMaiorIdade= obj.QtdMaioresIdades();
    	
    	System.out.println("Existe "+qtdMaiorIdade + " maiores de idade!!!");
    	
    	System.out.println("*****INICIANDO NomesMaioresIdades*****");
    	obj.NomesMaioresIdades();
    	
    	System.out.println("*****INICIANDO PesquisarPorNome*****");
    	System.out.print("digite um nome para buscar:");
    	String nome= input.next();
    	obj.PesquisarPorNome(nome);
    	
    	System.out.println("*****INICIANDO PesquisarPorIdade*****");
    	System.out.print("digite uma idade para buscar:");
    	int idade= input.nextInt();
    	obj.PesquisarPorIdade(idade);
    	
    }
}
