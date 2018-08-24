import java.util.Scanner;

public class VizinhosPares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Digite um numero: ");
		num=teclado.nextInt();
		
		if(num%2==0)
			System.out.println((num-2)+" "+(num+2));
		else
			System.out.println((num-1)+" "+(num+1));
	}

}
