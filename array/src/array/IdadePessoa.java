package array;

import java.util.Scanner;

public class IdadePessoa {
	//declaração dos atriutos
	 protected String Nomes[];
	 protected int Idades[];
	 
	 //declaração construtor
	 public  IdadePessoa(int tamanho) {
		 Nomes= new String[tamanho];
		 Idades= new int[tamanho];
	 }//fim contrutor
	 
	 public void Preenchimento() {
		 Scanner input = new Scanner (System.in);
		 for(int contador=0; contador < Idades.length; contador++) {
			 System.out.print("Digite o nome:");
			 Nomes[contador]= input.next();
			 System.out.print("Digite a idade:");
			 Idades[contador]= input.nextInt();
			 
		 }//fim for
			 }//fim preenchimento
	 
	 //Imprime os vetores de Nome e Idades
	 public void MostraVetores( ) {
		 for(int contador=0; contador < Idades.length; contador++ ) {
			 System.out.println("NOme:"+Nomes[contador]+ " Possui "+
		 Idades[contador]+ " anos");
		 }
		  }
	 public int QtdMaioresIdades() {
		 int qtd=0;
		 for(int contador=0; contador < Idades.length; contador++) {
			 if(Idades[contador]>=18) {
				 qtd++;}
			 }
		 return qtd;
	 }
		 public void NomesMaioresIdades() {
			 for(int contador=0; contador < Idades.length; contador++) {
				 if(Idades[contador]>=18) {
					 
				 }
		 }

	 }
		 public void PesquisarPorNome(String nome) {
		 for(int contador = 0; contador < Nomes.length; contador++) {
			 if(nome.equals(Nomes[contador])) {
				 System.out.println(nome+ " está na prosição:"+contador);
			 }
		 }
	 } 	 public void PesquisarPorIdade(int idade) {
		 for(int contador = 0; contador < Idades.length; contador++) {
			 if(idade==Idades[contador]) {
				 System.out.println(idade+ " está na prosição:"+contador);
			 }
		 }
	 }
		 }
			 


