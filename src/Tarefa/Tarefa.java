package Tarefa;
import java.util.List;

public abstract class Tarefa {
    
    // Atributos da classe 
    private String descricao;
    private Prioridade prioridade;
    private Status status;

    protected enum Status{todo, doing, done};
    public enum Prioridade{baixa, media, alta}
    
    
    //-------------------------- Métodos getteres --------------------------//

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }


    //-------------------------- Métodos setteres --------------------------//

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    //------------------------------------- Funções -------------------------------------//
    public void executar(){
        setStatus(Status.doing);
    }

    public void finalizar() {
		setStatus(Status.done);

	}


    //------------------------------------ Construtores ------------------------------------//
    public Tarefa(String descricao, Prioridade prioridade){
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = Status.todo;
    }

    @Override
	public String toString() {
		String retorno = "A tarefa "+ this.descricao + " tem priodade "+ this.prioridade + " e status " + this.status;
		return retorno;
	}







}
