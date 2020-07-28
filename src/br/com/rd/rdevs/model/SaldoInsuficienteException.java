package br.com.rd.rdevs.model;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
