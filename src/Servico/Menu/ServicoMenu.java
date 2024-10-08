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
    private static String[] escolhafiltrar = {"Tarefa simples", "Tarefas com prazo", "Todos", "Sair"};



    ServicoMenuSecundario servicoMenuSecundario = new ServicoMenuSecundario();
    ServicoTarefa servicoTarefa = new ServicoTarefa();

     


    //----------------------------------------- Menu principal -----------------------------------------//
    public void menuPrincipal(){

        boolean sairMenuPrincipal = false;

        while(sairMenuPrincipal == false){

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

    public void menuTarefas(){

        boolean sairMenuTarefas = false;

        while(sairMenuTarefas == false){

            int resultadoEscolhaTarefas = JOptionPane.showOptionDialog(null, "Gerenciamento de tarefas: ", "Menu tarefas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaTarefas, escolhaTarefas[0]);
        
            switch (resultadoEscolhaTarefas + 1) {
                case Constantes.CRIAR_TAREFAS:
                    servicoMenuSecundario.menuCriarTarefa();
                    break;
            
                case Constantes.VISUALIZAR_T:
                    JOptionPane.showMessageDialog(null, "Minhas tarefas: \n\n Tarefas simples:" + servicoTarefa.visualizarTarefasSimples() + "\n\n Tarefas com prazo: \n" + servicoTarefa.visualizarComPrazo());                    
                    break;
                
                case Constantes.SAIR_T:
                    sairMenuTarefas = true;
                    break;
                
            }
        }

    }


    public void menuProjetos(){

        boolean sairMenuProjetos = false;

        while(sairMenuProjetos == false){

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

        boolean sairMenuConsultas = false;

        while(sairMenuConsultas == false){

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

