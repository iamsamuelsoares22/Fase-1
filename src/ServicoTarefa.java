import java.util.HashMap;
import javax.swing.*;

public class ServicoTarefa {

    // Lista responsável por armazenar as tarefas simples
    HashMap<String, TarefaSimples> tarefasSimples = new HashMap<String, TarefaSimples>();
    // Lista responsável por armazenar as tarefas com prazos
    HashMap<String, TarefaPrazo> tarefasPrazo = new HashMap<String, TarefaPrazo>();

    //------------------------------ Funções tarefas ------------------------------//
    public void criarTarefaSimples(){

        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da tarefa: ");
        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa: ");
        String prioridade = "";
        String status = Constantes.NAO_FINALIZADA;


        //----------------------------------------------- Escolha prioridade -----------------------------------------------//
        // >> Menu prioridade
        String[] escolhaPrioridade = {"Baixa", "Média", "Alta"};
        
        // Variável para a estrutura de repetição
        boolean sairEscolhaPrioridade = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairEscolhaPrioridade == false){

            // Escolha do Menu principal
            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Escolha a prioridade da tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrioridade, escolhaPrioridade[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.BAIXA:
                    prioridade = "Baixa";
                    sairEscolhaPrioridade = true;
                    break;
            
                case Constantes.MEDIA:
                    prioridade = "Média";
                    sairEscolhaPrioridade = true;
                    break;

                case Constantes.ALTA:
                    prioridade = "Alta";
                    sairEscolhaPrioridade = true;
                    break;
                
            }
        }

        TarefaSimples tarefasimples = new TarefaSimples(nome, descricao, prioridade, status);

        //Listando tarefa simples
        tarefasSimples.put(nome, tarefasimples);

        // Confirmação de tarefa
        JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!");
    }

    public void criarTarefaPrazo(){

        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da tarefa: ");
        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa: ");
        String prioridade = "";
        String status = Constantes.NAO_FINALIZADA;
        String prazo = JOptionPane.showInputDialog(null, "Digite o prazo da tarefa:   exemplo(10/08/2024)");


        //----------------------------------------------- Escolha prioridade -----------------------------------------------//
        // >> Menu prioridade
        String[] escolhaPrioridade = {"Baixa", "Média", "Alta"};
        
        // Variável para a estrutura de repetição
        boolean sairEscolhaPrioridade = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairEscolhaPrioridade == false){

            // Escolha do Menu principal
            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Escolha a prioridade da tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrioridade, escolhaPrioridade[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.BAIXA:
                    prioridade = "Baixa";
                    sairEscolhaPrioridade = true;
                    break;
            
                case Constantes.MEDIA:
                    prioridade = "Média";
                    sairEscolhaPrioridade = true;
                    break;

                case Constantes.ALTA:
                    prioridade = "Alta";
                    sairEscolhaPrioridade = true;
                    break;
                
            }
        }

        TarefaPrazo tarefaprazo = new TarefaPrazo(nome, descricao, prioridade, status, prazo);

        //Listando tarefa com prazo
        tarefasPrazo.put(nome, tarefaprazo);

        // Confirmação de tarefa
        JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!");
    }

    // Visualizar lista de tarefas simples
    public String visualizarTarefasSimples(){
        String varAuxiliar = "";

        for (HashMap.Entry<String, TarefaSimples> tarefasSimples : tarefasSimples.entrySet()) {
            varAuxiliar += "Nome: " + tarefasSimples.getValue().getTitulo() + "   -   Descrição: "  + tarefasSimples.getValue().getDescricao() + "   -   Prioridade: "  + tarefasSimples.getValue().getPrioridade() +  "   -   Status: "  + tarefasSimples.getValue().getStatus() +"\n";
        }
        
        return varAuxiliar;
    }

    
}
