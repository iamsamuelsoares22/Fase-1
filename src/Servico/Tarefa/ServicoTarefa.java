package Servico.Tarefa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDate;

import Constantes.Constantes;
import Tarefa.Tarefa.Prioridade;

import Tarefa.TarefaPrazo;
import Tarefa.TarefaSimples;

public class ServicoTarefa {

    public static ArrayList<TarefaSimples> tarefasSimples = new ArrayList<TarefaSimples>();
    public static ArrayList<TarefaPrazo> tarefasComPrazo = new ArrayList<TarefaPrazo>();


    public void criarTarefaSimples(){

        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa: ");

        TarefaSimples tarefasimples = new TarefaSimples(descricao, Prioridade.baixa);

        
        String[] escolhaPrioridade = {"Baixa", "Média", "Alta"};
        
        boolean sairEscolhaPrioridade = false;

        while(sairEscolhaPrioridade == false){

            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Escolha a prioridade da tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrioridade, escolhaPrioridade[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.BAIXA:
                    tarefasimples.setPrioridade(Prioridade.baixa);
                    sairEscolhaPrioridade = true;
                    break;
            
                case Constantes.MEDIA:
                    tarefasimples.setPrioridade(Prioridade.media);
                    sairEscolhaPrioridade = true;
                    break;

                case Constantes.ALTA:
                    tarefasimples.setPrioridade(Prioridade.alta);
                    sairEscolhaPrioridade = true;
                    break;
                
            }
        }

        tarefasSimples.add(tarefasimples);

        JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!");

        
    }

    public void criarTarefaPrazo(){

        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa: ");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia(Número) do prazo:   exemplo(12)"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês(Número) do prazo:   exemplo(9)"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano(Número) do prazo:   exemplo(2024)"));

        TarefaPrazo tarefaprazo = new TarefaPrazo(descricao, Prioridade.baixa, LocalDate.of(ano, mes, dia));

        
        String[] escolhaPrioridade = {"Baixa", "Média", "Alta"};
        
        boolean sairEscolhaPrioridade = false;

        while(sairEscolhaPrioridade == false){

            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Escolha a prioridade da tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrioridade, escolhaPrioridade[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.BAIXA:
                    tarefaprazo.setPrioridade(Prioridade.baixa);
                    sairEscolhaPrioridade = true;
                    break;
            
                case Constantes.MEDIA:
                    tarefaprazo.setPrioridade(Prioridade.media);
                    sairEscolhaPrioridade = true;
                    break;

                case Constantes.ALTA:
                    tarefaprazo.setPrioridade(Prioridade.alta);
                    sairEscolhaPrioridade = true;
                    break;
                
            }
        }

        tarefasComPrazo.add(tarefaprazo);

        JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!");
    }

    public String visualizarTarefasSimples(){
        String varAuxiliar = "";

        for (int i = 0; i < tarefasSimples.size(); i++) {
            varAuxiliar += tarefasSimples.get(i);
        }
       
        return varAuxiliar;

    }

    public String visualizarComPrazo(){
        String varAuxiliar = "";

        for (int i = 0; i < tarefasComPrazo.size(); i++) {
            varAuxiliar += tarefasComPrazo.get(i);
        }
       
        return varAuxiliar;

    }

    
}
