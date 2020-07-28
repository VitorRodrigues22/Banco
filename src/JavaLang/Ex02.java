package JavaLang;

public class Ex02 {
	
	public static void caractere(String n) {
		for (int i = 0; i < n.length(); i++) {
			char x = n.charAt(i);
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		caractere("Vitor");
	}
	
}
