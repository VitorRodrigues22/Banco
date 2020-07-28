package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.com.rd.rdevs.contas.ManipuladorDeSeguroDeVida;
import br.com.rd.rdevs.contas.ManipuladorDeTributaveis;
import br.com.rd.rdevs.model.Conta;
import br.com.rd.rdevs.model.ContaCorrente;
import br.com.rd.rdevs.model.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {

		ContaPoupanca c1 = new ContaPoupanca();
		ContaCorrente c2 = new ContaCorrente();
		ManipuladorDeSeguroDeVida m1 = new ManipuladorDeSeguroDeVida();
		ManipuladorDeTributaveis mt = new ManipuladorDeTributaveis();

		System.out.println("Quantidade de contas criadas: " + c1.pegaQuantidadeDeContas());

		c1.setTitular("Vitor");
		c1.setNumero(12487);
		c1.setAgencia("0104 - Bradesco");
		c1.setDataAbertura("17/07/2020");
		c1.depositar(5000);
		// c1.depositar(-5000);
		c1.sacar(100);
		// c1.sacar(500000);
		c1.transferencia(100, c2);
		c1.recuperarDadosParaImpressao();
		System.out.println("Calculo de rendimento: " + c1.calculaRendimento());
		c1.testeP();

		c2.setTitular("Rodrigues");
		c2.setDataAbertura("20/02/2020");
		c2.setAgencia("0104 - Bradesco");
		c2.setNumero(12487);
		c2.depositar(2000);
		c2.recuperarDadosParaImpressao();
		System.out.println("Calculo de rendimento: " + c2.calculaRendimento());
		System.out.println("Imposto: " + c2.getValorImposto());

		m1.criaSeguro(0001, "Rodrigues", 45.50);

		try {
			// c2.sacar(500000);
		} catch (Exception e) {
			throw new IllegalArgumentException("Erro ao sacar Conta Corrente: " + e.getMessage());
		}

		// COMPARAR VALORES COM COMPARETO
		if (c1.compareTo(c2) == 0) {
			System.out.println("\nNome dos titulares são iguais!");
		} else {
			System.out.println("\nNome dos titulares sao diferentes");
		}

		mt.getArrayTributos().add(c2.getValorImposto());
		mt.getArrayTributos().add(m1.getValorImposto());

		System.out.println("\nValor Total dos impostos: " + mt.calculaImpostos(mt.getArrayTributos()));

		/*
		 * cria o mapa Map<String, Conta> mapaDeContas = new HashMap(); // adiciona duas
		 * chaves e seus valores mapaDeContas.put("diretor", c1);
		 * mapaDeContas.put("gerente", c2);
		 * 
		 * // qual a conta do diretor? Conta contaDoDiretor =
		 * mapaDeContas.get("diretor"); System.out.println("" +
		 * contaDoDiretor.getSaldo());
		 */

	}

}
