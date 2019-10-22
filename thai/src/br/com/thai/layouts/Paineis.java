package br.com.thai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paineis extends JFrame {

    public Paineis(){
        setTitle("Paineis");
        setBackground(Color.LIGHT_GRAY);
        setSize(350,200);
        setLayout();
        setResizable(false);
  
    }

    private void setLayout(){
        JPanel panel = new JPanel();

        JPanel painelDireito = new JPanel();
        painelDireito.setLayout(new BorderLayout(10,10));

  
 
        JPanel Norte = createPanel(Color.BLUE,"Norte");
        JPanel Sul = createPanel(Color.RED,"Sul");
        JPanel Centro = createPanel(Color.WHITE,"Centro");
        JPanel Leste = createPanel(Color.GRAY,"Leste");
        JPanel Oeste = createPanel(Color.ORANGE,"Oeste");

  
        
        
        painelDireito.add(Norte, BorderLayout.NORTH);
        painelDireito.add(Sul, BorderLayout.SOUTH);
        painelDireito.add(Centro, BorderLayout.CENTER);
        painelDireito.add(Leste, BorderLayout.EAST);
        painelDireito.add(Oeste, BorderLayout.WEST);
        painelDireito.setVisible(true);
       
   
        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setLayout( new BoxLayout(painelEsquerdo, BoxLayout.PAGE_AXIS));


 
        JCheckBox cNorte = createCheckBox("Norte", Norte);
        JCheckBox cSul = createCheckBox("Sul", Sul);
        JCheckBox cCentro = createCheckBox("Centro", Centro);
        JCheckBox cLeste = createCheckBox("Leste", Leste);
        JCheckBox cOeste = createCheckBox("Oeste", Oeste);

        painelEsquerdo.add(cNorte);
        painelEsquerdo.add(cSul);
        painelEsquerdo.add(cCentro);
        painelEsquerdo.add(cLeste);
        painelEsquerdo.add(cOeste);
        
        panel.add(painelEsquerdo);
        panel.add(painelDireito);
  
        add(panel);
    }

    private JPanel createPanel(Color cor, String texto){
        JPanel panel = new JPanel();
        panel.setBackground(cor);
        panel.add(new JLabel(texto));
        return panel;
    }

    private JCheckBox createCheckBox(String texto, JPanel jPanel){
        JCheckBox checkBox = new JCheckBox(texto);
        checkBox.setSelected(true);
     
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setVisible(checkBox.isSelected());
            }
        });
        return checkBox;
    }
    
    public static void main(String[] args) {
        Paineis paineis = new Paineis();
        paineis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paineis.setVisible(true);
	}
}
