public class TarefaPrazo extends Tarefa {
    
    @Override
    public void finalizarTarefa(Tarefa tarefa){
        tarefa.setStatus("Concluída");
    }

    //----------------------------------- Construtores -----------------------------------//
    public TarefaPrazo(String titulo, String descricao, String prioridade, String status, String prazo){
        super(titulo, descricao, prioridade, status, prazo);
    }

}
