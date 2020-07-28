package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import br.com.rd.rdevs.model.Conta;

public class Ex05e06 {

	public static void main(String[] args) {
		System.out.println("Os exercícios 5 e 6 eu fiz no projeto Banco");
	}

	Collection<Conta> contas = new HashSet<>();
	Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

	public int pegaQuantidadeDeContas() {
		return this.mapaDeContas.size();
	}

	public Conta pega(int x) {
		return this.mapaDeContas.get(x);
	}

	public void adicionar(Conta c) {
		this.contas.add(c);
		this.mapaDeContas.put(c.getTitular(), c);
	}

	public Conta buscaPorTitular(String nomeDoTitular) {
		return this.mapaDeContas.get(nomeDoTitular);
	}

}
