package JavaLang;

public class Ex01 {

	public static void dentroString() {
		String a = "abcdefg";
		String b = "zzz";

		if (a.contains(b)) {
			System.out.println("Tem String dentro de String!");
		} else {
			System.out.println("NÃO tem String dentro de String");
		}

	}

	public static void espacoBranco() {
		String temp = " Vitor ".trim();
		System.out.println(temp);
	}

	public static void vazia() {

		String temp = "";

		// MÉTODO 1
		if (temp.isEmpty()) {
			System.out.println("String vazia");
		} else {
			System.out.println("String NÃO está vazia");
		}

		/*
		 * MÉTODO 2 if (temp.trim().equals("")) { 
		 * System.out.println("String vazia"); 
		 * } else { 
		 * System.out.println("String NÃO está vazia"); }
		 */

		/*
		 * MÉTODO 3 if (temp.length() < 1) { 
		 * System.out.println("String vazia"); 
		 * } else{ 
		 * System.out.println("String NÃO está vazia"); }
		 */

	}

	public static void caracteres() {
		String s = "dsdsawdsadsa";
		int max = s.length();

		System.out.println("Quantidade de caracteres: " + max);

	}

	public static void main(String[] args) {

		// USAMOS O MÉTODO CONTAINS() PARA SABER SE UMA STRING ESTÁ DENTRO DE OUTRA
		dentroString();

		// PARA TIRAR OS ESPAÇOS EM BRANCO DAS PONTAS DE UMA STRING UTILIZAMOS O MÉTODO
		// TRIM()
		espacoBranco();

		// PARA DESCOBRIR SE UMA STRING ESTÁ VAZIA PODEMOS O MÉTODO isEmpty() ou
		// UTILIZAR O TRIM OU O LENGHT()
		vazia();

		// PARA SABER QUANTOS CARACTERES TEM UMA STRING UTILIZAMOS O MÉTODO lenght()
		caracteres();
	}
}
