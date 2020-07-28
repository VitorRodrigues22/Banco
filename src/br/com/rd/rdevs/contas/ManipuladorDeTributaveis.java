package br.com.rd.rdevs.contas;

import java.util.ArrayList;

public class ManipuladorDeTributaveis {

	private ArrayList<Double> arrayTributos = new ArrayList<>();

	public double calculaImpostos(ArrayList<Double> array) {
		double total = 0;

		for (int i = 0; i < array.size(); i++) {
			total += array.get(i);
		}
		return total;
	}

	// GETTERS E SETTERS
	public ArrayList<Double> getArrayTributos() {
		return arrayTributos;
	}

	public void setArrayTributos(ArrayList<Double> arrayTributos) {
		this.arrayTributos = arrayTributos;
	}

}
