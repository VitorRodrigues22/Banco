package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.Collection;

import br.com.rd.rdevs.contas.ManipuladorDeTributaveis;
import br.com.rd.rdevs.model.ContaCorrente;

public class TestaTributos {
	public static void main(String[] args) {
		ManipuladorDeTributaveis m = new ManipuladorDeTributaveis();
		
		m.getArrayTributos().add(45.0);
		m.getArrayTributos().add(10.0);
		m.getArrayTributos().add(20.0);
		
		System.out.println("Valor total Tributos: " + m.calculaImpostos( m.getArrayTributos()));
		
	}
}
