package entities;

public class Vetor {
	
	private String [] elementos;
	private int tamanho;
	
	public Vetor( int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho =0;
	}

	
	/*
	 * O VALOR INICIAL DE UMA STRING QUE NÃO FOI ATRIBUÍDO É POR DEFAULT == NULL
	 * INTEIRO == 0;
	 * BOOLEAN == FALSE;
	 */
	
	/*public void adiciona(String elemento) {
		for(int i =0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
		
		
	}*/
	
	public void adiciona(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			
		}else {
			throw new Exception ("Vetor atingiu a capacidade máxima não é possível adicionar mais elementos! ");
		}
		
		
	}
	

}
