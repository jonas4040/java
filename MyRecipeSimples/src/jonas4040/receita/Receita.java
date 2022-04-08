package jonas4040.receita;
import java.util.List;
import java.util.Map;

public class Receita {
	private String titulo;
	private String tempoDePreparo;
	private String ingrediente_quantidade;
	private String modoDePreparo;
	
	public Receita() {}
	
	public Receita(String titulo) {
		this.titulo = titulo;
	}
	
	//getters & setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(String tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	public String getIngrediente_quantidade() {
		return ingrediente_quantidade;
	}

	public void setIngrediente_quantidade(String ingrediente_quantidade) {
		this.ingrediente_quantidade = ingrediente_quantidade;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Receita de ");
		 str.append(titulo).append("\n").append(tempoDePreparo).append("\n").append(ingrediente_quantidade).
		 append("\n").append(modoDePreparo);
		 
		 return str.toString();
	}
}
