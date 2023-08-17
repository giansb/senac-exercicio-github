/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolistaprodutos;

import javax.swing.JFrame;
import view.JanelaPrincipal;

/**
 *
 * @author 182210120
 */
public class ProjetoListaProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaPrincipal j = new JanelaPrincipal();
        j.setSize(500,700);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    
}
