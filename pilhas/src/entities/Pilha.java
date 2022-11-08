package entities;


/*
 * PILHAS SEGUEM O COMPORTAMENTO LIFO
 * LAST IN
 * FIRST OUT
 */
public class Pilha <T> {
	private T[] elementos;
	private int tamanho;
	
	public Pilha(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		tamanho =0;
	}
	
	public int tamanho() {
		return this.tamanho;
		
	}

	public String toString() {
		
	}
	
	
	

}
