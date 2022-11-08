package entities.base;

public class EstruturasEstaticas <T> {
	private T[] elementos;
	private int tamanho;
	
	public EstruturasEstaticas(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho =0;
	}
	
	public EstruturasEstaticas() {
		this(10);
		
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if(!(posicao>= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		this.aumentaCapacidade();
		
		for(int i = this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i]= this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

}
