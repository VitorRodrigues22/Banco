package br.com.rd.rdevs.model;


public class Gerente extends Funcionario {
	private int numeroDeFuncionariosGerenciados;
	private int senha;
	
	//MÉTODOS
	
	@Override
	public double getBonificacao() {
        return this.salario * 1.15;
    }
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	
	//GETTERS E SETTERS
	
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
