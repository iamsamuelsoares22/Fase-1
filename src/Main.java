import javax.swing.*;

import Servico.Menu.ServicoMenu;


public class Main {
    public static void main(String[] args){

        ServicoMenu servicoMenu = new ServicoMenu();

        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao seu gerenciador de tarefa");

        servicoMenu.menuPrincipal();

    }
}
