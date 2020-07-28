package br.com.rd.rdevs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Conta implements Comparable<Conta> {
	private int identificador;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	private static int qntdUsers;

	// ===== MÉTODOS =====

	// MÉTODO SACAR
	public boolean sacar(double valorSacado) {
		if (this.getSaldo() < valorSacado || valorSacado < 0) {
			throw new SaldoInsuficienteException("Saldo Insuficiente ou o valor passado é negativo!");
		} else {
			if (getTipoConta() == "Corrente") {
				this.saldo -= 0.1;
			}
			this.saldo = this.saldo - valorSacado;
			return true;
		}
	}

	// MÉTODO DEPOSITAR
	public boolean depositar(double valorDepositado) {
		try {
			if (valorDepositado < 0) {
				throw new IllegalArgumentException("Valor passado no depósito é negativo.");
			} else {
				this.saldo += valorDepositado;
				return true;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Erro depositar: " + e.getMessage());
		}
	}

	// MÉTODO TRANSFERÊNCIA
	public boolean transferencia(double valor, Conta destino) {
		boolean retirou = this.sacar(valor);

		if (!retirou) {
			return false;
		} else {
			destino.depositar(valor);
			return true;
		}

	}

	// MÉTODO CALCULA RENDIMENTO
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	// MÉTODO PARA IMPRIMIR AS INFORMAÇÕES DA CONTA
	public void recuperarDadosParaImpressao() {
		System.out.println("\n");
		System.out.println("ID: " + getIdentificador() + "\nTitular: " + getTitular() + "\nNumero: " + getNumero()
				+ "\nConta: " + getTipoConta() + "\nAgência: " + getAgencia() + "\nSaldo: " + getSaldo()
				+ "\nData Abertura: " + getDataAbertura());
	}

	// MÉTODO PARA DEFINIR O TIPO DE CONTA
	public abstract String getTipoConta();

	// MÉTODO PARA FAZER A COMPARAÇÃO
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	// ==== EXERCÍCIOS COLLECTIONS ==== \\
	Collection<Conta> contas = new HashSet<>();
	Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

	public void adicionar(Conta c) {
		this.contas.add(c);
		this.mapaDeContas.put(c.getTitular(), c);
	}

	public Conta pega(int x) {
		return this.mapaDeContas.get(x);
	}

	public Conta buscaPorTitular(String nomeDoTitular) {
		return this.mapaDeContas.get(nomeDoTitular);
	}

	public int pegaQuantidadeDeContas() {
		return this.mapaDeContas.size();
	}

	// *****
	// *****
	// *****
	// *****

	// CONSTRUTORES

	public Conta() {
		this.qntdUsers++;
		this.identificador = qntdUsers;
	}

	public Conta(String titular) {
		this.qntdUsers++;
		this.identificador = qntdUsers;
		this.titular = titular;
	}

	// GETTERS E SETTERS

	public int getIdentificador() {
		return identificador;
	}

	public static int getqntdUsers() {
		return qntdUsers;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
