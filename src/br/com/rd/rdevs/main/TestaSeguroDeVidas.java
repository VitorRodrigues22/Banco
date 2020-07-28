package br.com.rd.rdevs.main;

import java.util.Collection;
import java.util.HashSet;

import br.com.rd.rdevs.contas.ManipuladorDeSeguroDeVida;

public class TestaSeguroDeVidas {
	public static void main(String[] args) {
		ManipuladorDeSeguroDeVida m = new ManipuladorDeSeguroDeVida();
		ManipuladorDeSeguroDeVida m1 = new ManipuladorDeSeguroDeVida();
		

		m.criaSeguro(457878, "Vitor", 45785);
		m1.criaSeguro(444444, "Rodrigues", 44444);
		
		m.recuperaSeguro();
		m1.recuperaSeguro();
		
		
		
	}
}
