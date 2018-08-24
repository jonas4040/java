import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade,faltam;
		final int LIMITE=65;
		System.out.print("Digite a idade: ");
		idade=teclado.nextInt();
		faltam = LIMITE-idade;
		
		if(idade<LIMITE)
			System.out.println("Faltam "+faltam+" anos");
		else
			System.out.println("Aposentadoria liberada");
	}

}
