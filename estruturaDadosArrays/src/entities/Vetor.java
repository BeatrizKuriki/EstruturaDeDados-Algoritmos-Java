package entities;

public class Vetor {
	
	private String [] elementos;
	
	public Vetor( int capacidade) {
		this.elementos = new String[capacidade];
	}

	
	/*
	 * O VALOR INICIAL DE UMA STRING QUE NÃO FOI ATRIBUÍDO É POR DEFAULT == NULL
	 * INTEIRO == 0;
	 * BOOLEAN == FALSE;
	 */
	
	public void adiciona(String elemento) {
		for(int i =0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
		
		
	}
	
	

}
