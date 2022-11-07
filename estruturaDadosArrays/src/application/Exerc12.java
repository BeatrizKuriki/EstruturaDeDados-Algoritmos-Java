package application;

import java.util.ArrayList;

public class Exerc12 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		
		System.out.println(arrayList);
		
		arrayList.add(0, "1");
		System.out.println(arrayList);
		
		//o método contains é similar com o método de busca que implementamos no vetor
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Elemento existe no array!");
		}else {
			System.out.println("Elemento não existe no array!");
		}
		
		int pos = arrayList.indexOf("B");
		
		System.out.println("O elemento B encontra-se na posição: "+ pos);

	}

}
