import javax.swing.*;

public class ServicoMenu {

    //--------------- Escolhas do(s) menu(s) para o JOptionPane ---------------//
    // >> Menu principal
    private static String[] escolhaPrincipal = {"Tarefas", "Projetos", "Consultas", "Sair"};
    // >> Menu tarefas
    private static String[] escolhaTarefas = {"Criar tarefa", "Visualizar", "Sair"};
    // >> Menu projetos
    private static String[] escolhaProjetos = {"Criar projeto", "Visualizar", "Sair"};
    // >> Menu consultas
    private static String[] escolhaConsulta = {"Visualizar tarefas", "Visualizar projetos", "Sair"};


    //---------------------------------------- Criando instâncias ----------------------------------------//
    ServicoMenuSecundario servicoMenuSecundario = new ServicoMenuSecundario();
     


    //----------------------------------------- Menu principal -----------------------------------------//
    public void menuPrincipal(){

        // Variável para a estrutura de repetição
        boolean sairMenuPrincipal = false;

        // Repetir programa até que a escolha sair seja executada 
        while(sairMenuPrincipal == false){

            // Escolha do Menu principal
            int resultadoEscolhaPrincipal = JOptionPane.showOptionDialog(null, "Gerenciamento de tarefas e projetos: ", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaPrincipal, escolhaPrincipal[0]);
        
            switch (resultadoEscolhaPrincipal + 1) {
                case 1:
                    menuTarefas();
                    break;
            
                case 2:
                    menuProjetos();
                    break;
                
                case 3:
                    menuConsultas();
                    break;

                case 4:
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
                case 1:
                    servicoMenuSecundario.criarTarefa();
                    break;
            
                case 2:

                    break;
                
                case 3:
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
                case 1:
                    
                    break;
            
                case 2:

                    break;
                
                case 3:
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
                case 1:
                    
                    break;
            
                case 2:

                    break;
                
                case 3:
                    sairMenuConsultas = true;
                    break;

            }
        }

    }

    

}

