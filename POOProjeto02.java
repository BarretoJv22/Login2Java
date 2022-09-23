
package pooprojeto02;

import javax.swing.JOptionPane;
public class POOProjeto02 {


    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do infeliz: ");
        
    Joao joao = new Joao(nome);
    joao.informacoesJoao();
    }
    
}
