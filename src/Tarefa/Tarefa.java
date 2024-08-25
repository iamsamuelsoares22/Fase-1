package Tarefa;

public abstract class Tarefa {
    
    private String descricao;
    private Prioridade prioridade;
    private Status status;

    protected enum Status{todo, doing, done};
    public enum Prioridade{baixa, media, alta}
    
    

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public void executar(){
        setStatus(Status.doing);
    }

    public void finalizar() {
		setStatus(Status.done);

	}


    public Tarefa(String descricao, Prioridade prioridade){
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = Status.todo;
    }

    @Override
	public String toString() {
		String retorno = "Descrição: "+ this.descricao + " | Prioridade: "+ this.prioridade + " | Status: " + this.status;
		return retorno;
	}







}
