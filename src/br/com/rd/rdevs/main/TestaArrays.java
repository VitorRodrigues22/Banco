package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Conta;
import br.com.rd.rdevs.model.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		Conta[] c = new Conta[10];

		for (int i = 0; i < c.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
			c[i] = conta;
		}

		double total = 0;

		for (int i = 0; i < c.length; i++) {
			c[i].recuperarDadosParaImpressao();
			total += c[i].getSaldo();
		}

		System.out.println("\nMédia dos saldos: " + total / c.length);

	}
}
