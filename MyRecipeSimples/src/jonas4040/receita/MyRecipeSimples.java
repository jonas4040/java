package jonas4040.receita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class MyRecipeSimples {

	public static void main(String[] args) {
		Receita receita = new Receita();
		//addDoArquivo("receitas.txt","Receitas");
		System.out.println("::"+buscar("Sache"));
	}
	
	public static boolean adicionar(Receita receita) {
		return false;
	}
	
	/*public static void addDoArquivo(String caminho,String conteudo){
		try(
			FileWriter fileBuilder=new FileWriter(caminho,true);
			BufferedWriter buffer = new BufferedWriter(fileBuilder);
			PrintWriter escrevedorDeArquivo = new PrintWriter(buffer);
		){
			escrevedorDeArquivo.append(conteudo);
		}catch(IOException e){
			System.out.println("Ocorreu o seguinte erro: \n\t");
			e.printStackTrace();
		}
	}*/
	
	public static void remover(Receita receita) {
		
	}
	
	public static Receita buscar(String ingrediente) {
		Receita[] rct=lerArquivo("receitas.txt");
		
	    System.out.println("--->"+rct);
	    for(int i=0;i<=3;i++) {
		if(rct[i]!=null && rct[i].getIngrediente_quantidade().contains(ingrediente)) {
			return rct[i];
		}
	    }
		return null;
	}
	
	public static Receita[] lerArquivo(String caminho){
		List<Receita> list = new ArrayList<>();
		String linha="";
		String[] palavras;
		Receita[] receita = new Receita[40];//tamanho arbitrario
		try(
			BufferedReader bfrReader = new BufferedReader(new FileReader(caminho));
		){
			int qtdLinhas=0, i=0;
			while((linha = bfrReader.readLine()) != null ){
				try {
				
				palavras = linha.split(";");
				qtdLinhas++;
				i++;
				receita[i]=new Receita();
				receita[i].setTitulo(palavras[0]);
				receita[i].setTempoDePreparo(palavras[1]);
				receita[i].setIngrediente_quantidade(palavras[2]);
				receita[i].setModoDePreparo(palavras[3]);
				
				//System.out.println(receita[i]);
				
				}catch(NullPointerException e) {
					e.printStackTrace();
					//System.out.println(e.getMessage());
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			//System.out.println(linha);
		}catch(IOException e){
			System.out.println("Ocorreu o seguinte erro: \n\t");
			e.printStackTrace();
		}
		return receita;
	}

}
