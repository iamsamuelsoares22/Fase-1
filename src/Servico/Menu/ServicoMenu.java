package Servico.Menu;
import javax.swing.*;

import Constantes.Constantes;
import Servico.Tarefa.ServicoTarefa;

public class ServicoMenu {

    //--------------- Escolhas do(s) menu(s) para o JOptionPane ---------------//
    // >> Menu principal
    private static String[] escolhaPrincipal = {"Tarefas", "Projetos", "Consultas", "Sair"};
    // >> Menu tarefas
    private static String[] escolhaTarefas = {"Criar tarefa", "Visualizar", "Sair"};
    // >> Menu projetos
    private static String[] escolhaProjetos = {"Criar projeto", "Atualizar/Excluir", "Visualizar", "Sair"};
    // >> Menu consultas
    private static String[] escolhaConsulta = {"Visualizar tarefas", "Visualizar projetos", "Sair"};


    //---------------------------------------- Criando instâncias ----------------------------------------//
    ServicoMenuSecundario servicoMenuSecundario = new ServicoMenuSecundario();
    ServicoTarefa servicoTarefa = new ServicoTarefa();

     


    //----------------------------------------- Menu principal -----------------------------------------//
    public void menuPrincipal(){

        // Variável para a estrutura de repetição
        boolean sairMenuPrincipal = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairMenuPrincipal == false){

            // Escolha do Menu principal
            int resultadoEscolhaPrincipal = JOptionPane.showOptionDialog(null, "Gerenciamento de tarefas e projetos: ", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrincipal, escolhaPrincipal[0]);
        
            switch (resultadoEscolhaPrincipal + 1) {
                case Constantes.TAREFAS:
                    menuTarefas();
                    break;
            
                case Constantes.PROJETOS:
                    menuProjetos();
                    break;
                
                case Constantes.CONSULTAS:
                    menuConsultas();
                    break;

                case Constantes.SAIR:
                    sairMenuPrincipal = true;
                    break;

            }
        }

    }

    //----------------------------------------- Menu(s) secundários -----------------------------------------//
    public void menuTarefas(){

        // Variável para a estrutura de repetição
        boolean sairMenuTarefas = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairMenuTarefas == false){

            // Escolha do Menu principal
            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Gerenciamento de tarefas: ", "Menu tarefas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaTarefas, escolhaTarefas[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.CRIAR_TAREFAS:
                    servicoMenuSecundario.menuCriarTarefa();
                    break;
            
                case Constantes.VISUALIZAR_T:
                    JOptionPane.showMessageDialog(null, "Tarefas simples: \n" + servicoTarefa.visualizarTarefasSimples());
                    
                    break;
                
                case Constantes.SAIR_T:
                    sairMenuTarefas = true;
                    break;
                
            }
        }

    }


    public void menuProjetos(){

        // Variável para a estrutura de repetição
        boolean sairMenuProjetos = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairMenuProjetos == false){

            // Escolha do Menu principal
            int resultadoEscolhaProjetos = JOptionPane.showOptionDialog(null, "Gerenciamento de projetos: ", "Menu projetos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaProjetos, escolhaProjetos[0]);
        
            switch (resultadoEscolhaProjetos + 1) {
                case Constantes.CRIAR_PROJETOS:
                    
                    break;

                case Constantes.ATUALIZAR_P:
                    servicoMenuSecundario.menuAtualizarProjeto();
                    break;
            
                case Constantes.VISUALIZAR_P:

                    break;
                
                case Constantes.SAIR_P:
                    sairMenuProjetos = true;
                    break;

            }
        }
    

    }


    public void menuConsultas(){

        // Variável para a estrutura de repetição
        boolean sairMenuConsultas = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairMenuConsultas == false){

            // Escolha do Menu principal
            int resultadoEscolhaConsulta = JOptionPane.showOptionDialog(null, "Gerenciamento de consultas: ", "Menu consulta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaConsulta, escolhaConsulta[0]);
        
            switch (resultadoEscolhaConsulta + 1) {
                case Constantes.VISU_TAREFAS:
                    
                    break;
            
                case Constantes.VISU_PROJETOS:

                    break;
                
                case Constantes.SAIR_C:
                    sairMenuConsultas = true;
                    break;

            }
        }

    }
}

