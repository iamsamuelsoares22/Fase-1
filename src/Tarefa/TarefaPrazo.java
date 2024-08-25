package Tarefa;
import java.time.LocalDate;

public class TarefaPrazo extends Tarefa {
    private LocalDate prazo;


    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }



    @Override
	public void executar() {
		//System.out.println("A tarefa com prazo "+ this.prazo + "e descrição "+ getDescricao() + " está sendo executada.");
		setStatus(Status.doing);
	}

    	
	@Override
	public void finalizar() {
		//System.out.println("A tarefa com prazo "+ this.prazo + " e descricao "+  getDescricao() + " está finalizada");
		setStatus(Status.done);
	}



    //------------------------------- Construtores -------------------------------//
    public TarefaPrazo(String descricao, Prioridade prioridade, LocalDate prazo){
        super(descricao, prioridade);
        this.prazo = prazo;
    }

	@Override
	public String toString() {
		String retorno = "Projeto: "+ getDescricao() + "| Prioridade: " + getPrioridade() + "| Prazo: " +getPrazo();
	return retorno;
	}





}
