package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex01 {
	
	
	public static void function() {
		Collection<Integer> teste = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		
		//LinkedList ll = new LinkedList();
		
		Collection<Integer> teste = new HashSet<>();
		
		//ArrayList<Integer> teste = new ArrayList<>();
		//Collection<Integer> teste = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
	
	
	//O ARRAYLIST � MAIS LENTO DO QUE O HASHSET, ENQUANTO O ARRAYLIST FAZ TEMPO DE 300 O HASH FAZ 8
	
	//A PESQUISA � MAIS LENTA DO QUE A INSER��O, SEM A PESQUISA O TEMPO DO ARRAYLIST � DE 2
	

}
