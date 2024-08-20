import javax.swing.*;

public class ServicoMenuSecundario {
    
    //--------------- Escolhas do(s) menu(s) para o JOptionPane ---------------//
    // >> Menu tarefas
    private static String[] escolhaCriarTarefas = {"Tarefa simples", "Tarefas com prazo", "Sair"};


    //----------------------------------------- Menu(s) secundários -----------------------------------------//
    public void criarTarefa(){

        // Variável para a estrutura de repetição
        boolean sairCriarTarefas = false;

        // Escolha do Menu principal
        int resultadoCriarTarefas = JOptionPane.showOptionDialog(null, "Criar tarefa: ", "Escolha o tipo da tarefa que deseja criar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhaCriarTarefas, escolhaCriarTarefas[0]);

        while(sairCriarTarefas == false) {

            switch (resultadoCriarTarefas + 1) {
                case 1:
                    
                    break;
            
                case 2:

                    break;
                
                case 3:
                    sairCriarTarefas = true;
                    break;

            }         
        }
    }
}
