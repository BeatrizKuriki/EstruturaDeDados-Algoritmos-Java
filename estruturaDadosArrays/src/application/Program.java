package application;

import entities.Vetor;

public class Program {

	public static void main(String[] args) {

		/*
		 * UM VETOR É A ESTRUTURA DE DADOS MAIS SIMPLES QUE EXISTE!
		 * UM VETOR ARMAZENA UMA SEQUÊNCIA DE VALORES ONDE TODOS SÃO DO MESMO TIPO;
		 */

		Vetor vetor = new Vetor(10);


		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		
		System.out.println(vetor.tamanho());
		
		/*
		 * QUANDO FOR IMPRIMIR O VETOR SERÁ GERADO UM ARRAY COM OS TRÊS ELEMENTOS
		 * QUE FORAM ADICIONADOS E MAIS OS ESPAÇOS VAZIOS. NO ENTANTO QUEREMOS QUE O VETOR
		 * SÓ MOSTRE OS ESPAÇOS COM ELEMENTOS E NÃO COM NULL.
		 * ENTÃO DENTRO DO MÉTODO TOSTRING SERÁ NECESSÁRIO ITERAR UTILIZANDO O LAÇO FOR TODOS OS ELEMENTOS DO VETOR E 
		 * ADICIONAR A STRING
		 * 
		 */
		System.out.println(vetor);
		
	System.out.println(vetor.busca(1));	






	}

}
