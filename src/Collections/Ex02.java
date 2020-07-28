package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex02 {
	public static void main(String[] args) {

		System.out.println("A coleção Collections só pode ser usado em métodos estáticos\r\n"
				+ "se eu criar o array na classe main e precisar instanciar\r\n"
				+ "seu valor como parametro em um método sem static dentro\r\n" + "de outra classe ele não funciona.");
		
		System.out.println("\nEu fiz um teste na classe ManipuladorDeTributaveis passando a Collections como parametro e ele não funcionou, funcionou apenas quando troquei para ArrayList");
	}
}
