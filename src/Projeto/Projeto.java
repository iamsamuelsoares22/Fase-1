package Projeto;
import java.time.LocalDate;

public class Projeto {
	
	private String nome;
	private LocalDate inicio;
	private LocalDate fim;
	
	
	//-------------------------- Métodos getteres --------------------------//
	public String getNome() {
		return nome;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFim() {
		return fim;
	}


	//-------------------------- Métodos setteres --------------------------//
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	
	public void setFim(LocalDate fim) {
		this.fim = fim;
	}



	//------------------------------------ Construtores ------------------------------------//
	public Projeto(String nome, LocalDate inicio, LocalDate fim) {
		this.nome = nome;
		this.inicio = inicio;
		this.fim = fim;

	}
	
	@Override
	public String toString() {
		String retorno = "";
		retorno = "O projeto " + getNome() + " com data de inicio " + getInicio()+ " e data de fim "+ getFim() + "\n";
	return retorno;
	}
	
}

