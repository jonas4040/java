import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Digite um numero: ");
		num=teclado.nextInt();
		
		if(num%2==0)
			System.out.println(num+" é par!");
		else
			System.out.println(num+" é impar!");
	}

}
