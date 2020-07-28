package JavaLang;

public class Ex03 {
	public static void inverter(String n) {

		int nLenght = n.length();
		char[] auxArray = new char[nLenght];

		// GRAVA OS CARACTERES EM UM ARRAY
		for (int i = 0; i < nLenght; i++) {
			auxArray[i] = n.charAt(i);
		}

		for (int i = 0; i < nLenght; i++) {

			// PEGA OS CARACTERE DA ULTIMA POSIÇÃO ATÉ A PRIMEIRA
			char x = auxArray[nLenght - 1 - i];
			System.out.print(x);
		}

	}

	public static void main(String[] args) {
		inverter("Vitor Rodrigues");
	}

}