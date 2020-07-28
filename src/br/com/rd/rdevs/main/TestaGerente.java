package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Funcionario;
import br.com.rd.rdevs.model.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		//Funcionario f = new Funcionario();
		//Gerente g = (Gerente) f;
		
		Gerente g = new Gerente();
		
		g.setSalario(2000);
		System.out.println("Salário com bonificação gerente: " + g.getBonificacao());
		
	}

}
