//TODO: 1 possibilidade fazer Serializacao e Desserializacao
package jonas4040.receita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyRecipeSimples {

	public static void main(String[] args) {
		Receita receita = new Receita();
				//lerArquivo("receitas.txt");
	}
	
	public static boolean adicionar(Receita receita) {
		return false;
	}
	
	public static void remover(Receita receita) {
		
	}
	
	public static Receita buscar(String ingrediente) {
		Receita receita = new Receita();
		if(lerArquivo("receitas.txt").contains(ingrediente)) {
			return receita;
		}
		return null;
	}
	
	public static String lerArquivo(String caminho){
		String linha = "";
		try(
			BufferedReader bfrReader = new BufferedReader(new FileReader(caminho));
		){
			
			while(true){
				if(linha != null){
					System.out.println(linha);
				}else{
					break;
				}
				linha += bfrReader.readLine();
			}
		}catch(IOException e){
			System.out.println("Ocorreu o seguinte erro: \n\t");
			e.printStackTrace();
		}
		return linha;
	}

}
