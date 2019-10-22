package br.com.thai;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        setTitle("Tela de Login");
        setSize(300, 250);
        setResizable(false);
        setLayout();
    }

    private void setLayout(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.setBorder(
                BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(3, 3, 3, 3),
                        BorderFactory.createTitledBorder(
                                BorderFactory.createLineBorder(Color.BLACK),
                                "Login"
                        )
                )
        );

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(55,-10,100,100);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(55,25,100,100);

        JTextField usuarioField = new JTextField();
        usuarioField.setToolTipText("Usuário");
        usuarioField.setBounds(115,30,100,20);

        JPasswordField senhaField = new JPasswordField();
        senhaField.setToolTipText("Senha");
        senhaField.setBounds(115,65,100,20);

        JButton botaoLoggin = new JButton("Acessar");
        botaoLoggin.setBounds(80,110,125,20);
        botaoLoggin.setBackground(Color.black);
        botaoLoggin.setForeground(Color.WHITE);

        JCheckBox manterLogado = new JCheckBox("Manter acessado");
        manterLogado.setBackground(Color.LIGHT_GRAY);
        manterLogado.setBounds(75,145,135,20);

        JLabel esqueciSenha = new JLabel("Esqueci minha senha");
        esqueciSenha.setForeground(Color.BLUE);
        esqueciSenha.setBounds(65,140,180,100);

        panel.add(labelUsuario);
        panel.add(labelSenha);
        panel.add(usuarioField);
        panel.add(senhaField);
        panel.add(botaoLoggin);
        panel.add(manterLogado);
        panel.add(esqueciSenha);
        add(panel);
    }
    
    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaLogin.show();
    }
    
}