import javax.swing.*;

import Servico.Menu.ServicoMenu;


public class Main {
    public static void main(String[] args){

        // Criando instâncias
        ServicoMenu servicoMenu = new ServicoMenu();


        //-------------------------------- Inicio do programa --------------------------------//

        // Mensagem inicial
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao seu gerenciador de tarefa");

        servicoMenu.menuPrincipal();

    }
}
