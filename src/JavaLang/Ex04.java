package JavaLang;

public class Ex04 {

	public static int converter(String x) {

		int inteiro = 0;

		for (int i = 0; i < x.length(); i++) {

			// GUARDA CADA CARACTERE EM UMA CHAR
			char c = x.charAt(i);

			// CONVERTE A CHAR EM UMA INT
			int aux = c - '0';

			// MULTIPLICA O VALOR ATUAL POR 10 E SOMA O PRÓXIMO "AUX";
			inteiro *= 10 + aux;
		}

		return inteiro;
	}

	public static void main(String[] args) {
		System.out.println("Valor em String: " + converter("762"));
	}
}
