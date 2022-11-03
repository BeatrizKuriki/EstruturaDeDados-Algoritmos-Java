package entities;

public class VetorObjetos {
	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	

	public boolean adiciona(Object elemento){
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
			}
		return false;
	}
	
	//0 1 2 3 4 5 6 = TAMANHO É 5
	//B C E F G + +
	public boolean adiciona(int posicao, Object elemento){
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
	
	
	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!");			
		}		
		return this.elementos[posicao];
		
	}
	
	/*
	 * VAMOS FAZER UM ALGORITMO DE BUSCA
	 * O MAIS SIMPLES É O ALGORTIMO DE BUSCA SEQUENCIAL.
	 */
	public int elementoExiste (Object elemento) {
		for(int i =0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
			
		}
		return -1;
			
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


