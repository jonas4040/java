package jonas4040.receita.teste;

import java.util.HashMap;
import java.util.Map;

import jonas4040.receita.Receita;

public class ReceitaTeste {

	public static void main(String[] args) {
		Receita brigadeiro = new Receita("Brigadeiro");
		Map<String,String> ingrediente_quantidade = new HashMap<>();
		ingrediente_quantidade.put("Manteiga","20g");
		ingrediente_quantidade.put("Leite Condensado","200g");
		ingrediente_quantidade.put("Chocolate em Po","100g");
		
		brigadeiro.setIngrediente_quantidade(ingrediente_quantidade);
		brigadeiro.setTempoDePreparo("20 min");
		brigadeiro.setModoDePreparo("Adicione os ingredientes e leve ao fogo ate desgrudar da panela");
	
		System.out.println(brigadeiro);
	}

}
