package br.com.rd.rdevs.contas;

import br.com.rd.rdevs.model.SeguroDeVida;

public class ManipuladorDeSeguroDeVida extends SeguroDeVida {

	private SeguroDeVida seguro;

	public void criaSeguro(int numeroApolice, String titular, double valor) {
		seguro = new SeguroDeVida(numeroApolice, titular, valor);
	}

	public void recuperaSeguro() {
		System.out.println("==== SEGURO DE VIDA ====");
		System.out.println("Numero: " + seguro.getNumeroApolice());
		System.out.println("Titular: " + seguro.getTitular());
		System.out.println("Valor: " + seguro.getValor());
		System.out.println("Imposto: " + seguro.getValorImposto() + "\n");
	}

}
