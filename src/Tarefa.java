public abstract class Tarefa {
    
    // Atributos da classe 
    private String titulo, descricao, proridade, status, prazo;

    
    //-------------------------- Métodos getteres --------------------------//
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getProridade() {
        return proridade;
    }

    public String getStatus() {
        return status;
    }

    public String getPrazo() {
        return prazo;
    }


    //-------------------------- Métodos setteres --------------------------//
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProridade(String proridade) {
        this.proridade = proridade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void stePrazo(String prazo) {
        this.prazo = prazo;
    }


    //------------------------------------- Funções -------------------------------------//
    public void finalizarTarefa(Tarefa tarefa){
        tarefa.setStatus("Concluída");
    }


    //----------------------------------- Construtores -----------------------------------//
    public Tarefa(){}

    public Tarefa(String titulo, String descricao, String proridade, String status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.proridade = proridade;
        this.status = status;
    }

    public Tarefa(String titulo, String descricao, String proridade, String status, String prazo){
        this.titulo = titulo;
        this.descricao = descricao;
        this.proridade = proridade;
        this.status = status;
        this.prazo = prazo;
    }

}
