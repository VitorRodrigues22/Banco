package JavaLang;

public class Ex01 {

	public static void dentroString() {
		String a = "abcdefg";
		String b = "zzz";

		if (a.contains(b)) {
			System.out.println("Tem String dentro de String!");
		} else {
			System.out.println("N�O tem String dentro de String");
		}

	}

	public static void espacoBranco() {
		String temp = " Vitor ".trim();
		System.out.println(temp);
	}

	public static void vazia() {

		String temp = "";

		// M�TODO 1
		if (temp.isEmpty()) {
			System.out.println("String vazia");
		} else {
			System.out.println("String N�O est� vazia");
		}

		/*
		 * M�TODO 2 if (temp.trim().equals("")) { 
		 * System.out.println("String vazia"); 
		 * } else { 
		 * System.out.println("String N�O est� vazia"); }
		 */

		/*
		 * M�TODO 3 if (temp.length() < 1) { 
		 * System.out.println("String vazia"); 
		 * } else{ 
		 * System.out.println("String N�O est� vazia"); }
		 */

	}

	public static void caracteres() {
		String s = "dsdsawdsadsa";
		int max = s.length();

		System.out.println("Quantidade de caracteres: " + max);

	}

	public static void main(String[] args) {

		// USAMOS O M�TODO CONTAINS() PARA SABER SE UMA STRING EST� DENTRO DE OUTRA
		dentroString();

		// PARA TIRAR OS ESPA�OS EM BRANCO DAS PONTAS DE UMA STRING UTILIZAMOS O M�TODO
		// TRIM()
		espacoBranco();

		// PARA DESCOBRIR SE UMA STRING EST� VAZIA PODEMOS O M�TODO isEmpty() ou
		// UTILIZAR O TRIM OU O LENGHT()
		vazia();

		// PARA SABER QUANTOS CARACTERES TEM UMA STRING UTILIZAMOS O M�TODO lenght()
		caracteres();
	}
}
