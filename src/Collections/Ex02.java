package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex02 {
	public static void main(String[] args) {

		System.out.println("A cole��o Collections s� pode ser usado em m�todos est�ticos\r\n"
				+ "se eu criar o array na classe main e precisar instanciar\r\n"
				+ "seu valor como parametro em um m�todo sem static dentro\r\n" + "de outra classe ele n�o funciona.");
		
		System.out.println("\nEu fiz um teste na classe ManipuladorDeTributaveis passando a Collections como parametro e ele n�o funcionou, funcionou apenas quando troquei para ArrayList");
	}
}
