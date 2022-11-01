package entities;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * O VALOR INICIAL DE UMA STRING QUE NÃO FOI ATRIBUÍDO É POR DEFAULT == NULL
	 * INTEIRO == 0; BOOLEAN == FALSE;
	 */

	/*
	 * public void adiciona(String elemento) { for(int i =0; i <
	 * this.elementos.length; i++) { if(this.elementos[i] == null) {
	 * this.elementos[i] = elemento; break; } }
	 * 
	 * 
	 * }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception{ if(this.tamanho <
	 * this.elementos.length) { this.elementos[this.tamanho] = elemento;
	 * this.tamanho++;
	 * 
	 * }else { throw new Exception
	 * ("Vetor atingiu a capacidade máxima não é possível adicionar mais elementos! "
	 * ); }
	 */
	
	private void aumentaCapacidade() {
		if(tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i< this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];				
			}
			this.elementos = elementosNovos;
		}
		
	}

	public boolean adiciona(String elemento){
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
			}
		return false;
	}
	
	//0 1 2 3 4 5 6 = TAMANHO É 5
	//B C E F G + +
	public boolean adiciona(int posicao, String elemento){
		this.aumentaCapacidade();
		 if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!");	
			}
		 
		 //MOVER TODOS OS ELEMENTOS
		 for(int i = this.tamanho-1; i >= posicao; i--) {
			 this.elementos[i+1] = this.elementos[i];			 
		 }
		 
		 this.elementos[posicao] = elemento;
		 this.tamanho++;
		 
		 
		return false;
	}
	
	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!");			
		}		
		return this.elementos[posicao];
		
	}
	
	/*
	 * VAMOS FAZER UM ALGORITMO DE BUSCA
	 * O MAIS SIMPLES É O ALGORTIMO DE BUSCA SEQUENCIAL.
	 */
	public int elementoExiste (String elemento) {
		for(int i =0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
			
		}
		return -1;
			
	}
	//B G D E F -> posição a ser removida é 1 (G)
	//0 1 2 3 4  -> tamanho é 5
	//vetor [1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	public void removeElemento(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!");
			
		}
		for(int i = posicao; i < this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];				
		}
		this.tamanho--;
		
		
	}

	

	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i< this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		
		return s.toString();
	}
}