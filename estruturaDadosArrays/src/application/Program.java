package application;

import entities.Vetor;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * UM VETOR É A ESTRUTURA DE DADOS MAIS SIMPLES QUE EXISTE!
		 * UM VETOR ARMAZENA UMA SEQUÊNCIA DE VALORES ONDE TODOS SÃO DO MESMO TIPO;
		 */
		
		Vetor vetor = new Vetor(2);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	}

}
