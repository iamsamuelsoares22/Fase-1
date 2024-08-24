package Servico.Menu;
import javax.swing.*;

import Constantes.Constantes;
import Servico.Tarefa.ServicoTarefa;

public class ServicoMenuSecundario {
    
    //--------------- Escolhas do(s) menu(s) para o JOptionPane ---------------//
    // >> Menu tarefas
    private static String[] escolhaCriarTarefas = {"Tarefa simples", "Tarefas com prazo", "Sair"};
    // >> Menu Projetos
    private static String[] escolhaAtualizarProjeto = {"Atualizar", "Remover", "Sair"};

    //---------------------------------------- Criando instâncias ----------------------------------------//
    ServicoTarefa servicoTarefa = new ServicoTarefa();


    //----------------------------------------- Menu(s) secundários -----------------------------------------//
    public void menuCriarTarefa(){

        // Variável para a estrutura de repetição
        boolean sairCriarTarefas = false;

        while(sairCriarTarefas == false) {

            // Escolha do Menu principal
            int resultadoCriarTarefas = JOptionPane.showOptionDialog(null, "Escolha o tipo da tarefa que deseja criar", "Criar tarefa", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaCriarTarefas, escolhaCriarTarefas[0]);

            switch (resultadoCriarTarefas + 1) {
                case Constantes.TAREFAS_SIMPLES:
                    servicoTarefa.criarTarefaSimples();
                    break;
            
                case Constantes.TAREFAS_PRAZO:
                    servicoTarefa.criarTarefaPrazo();
                    break;
                
                case Constantes.SAIR_CT:
                    sairCriarTarefas = true;
                    break;

            }         
        }
    }


    public void menuAtualizarProjeto(){

        // Variável para a estrutura de repetição
        boolean sairAtualizarProjeto = false;

        while(sairAtualizarProjeto == false) {

            // Escolha do Menu principal
            int resultadoAtualizarProjeto = JOptionPane.showOptionDialog(null, "Atualizar projeto: ", "Escolha como atualizar sua lista de projeto:", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaAtualizarProjeto, escolhaAtualizarProjeto[0]);

            switch (resultadoAtualizarProjeto + 1) {
                case Constantes.ATUALIZAR_PROJETO:
                    
                    break;
            
                case Constantes.EXCLUIR_PROJETO:

                    break;
                
                case Constantes.SAIR_AP:
                    sairAtualizarProjeto = true;
                    break;

            }         
        }
    }


}
