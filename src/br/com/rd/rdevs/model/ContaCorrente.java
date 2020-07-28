package br.com.rd.rdevs.model;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipoConta() {
		// TODO Auto-generated method stub
		return "Corrente";
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}
	
	

}
