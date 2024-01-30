package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Encerra a aplicação ao fechar a janela
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela do PC(null)

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });

        janela.setVisible(true);
    }
}
