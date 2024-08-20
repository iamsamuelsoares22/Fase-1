public class TarefaSimples extends Tarefa {
    
    @Override
    public void finalizarTarefa(Tarefa tarefa){
        tarefa.setStatus("Concluída");
    }

    //----------------------------------- Construtores -----------------------------------//
    public TarefaSimples(String titulo, String descricao, String prioridade, String status){
        super(titulo, descricao, prioridade, status);
    }

}
