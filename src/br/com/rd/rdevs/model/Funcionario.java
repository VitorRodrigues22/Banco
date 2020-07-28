package br.com.rd.rdevs.model;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	 
	//MÉTODOS
	
	public abstract double getBonificacao();
	
	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
