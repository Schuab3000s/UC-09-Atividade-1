package atividade1_uc09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atividade1_UC09 {

    private JFrame janela;
    private JTextField texto;

    public Atividade1_UC09() {
        janela = new JFrame("MVP (produto viável mínimo)");
        janela.setSize(300, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        texto = new JTextField(10);
        JButton button = new JButton("Calcular");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        panel.add(new JLabel("Informe o valor da venda:"));
        panel.add(texto);
        panel.add(button);

        janela.add(panel);
        janela.setVisible(true);
    }

    private void calcular() {
        double valor = Double.parseDouble(texto.getText());
        double desconto = 0;

        if (valor > 500) {

            desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de desconto: "));
            valor = valor * ((100 - desconto) / 100);
            JOptionPane.showMessageDialog(janela, "O valor da venda será de R$" + valor);

        } else {

            JOptionPane.showMessageDialog(janela, "O valor da venda será de R$" + valor);

        }
    }

    public static void main(String[] args) {

        new Atividade1_UC09();

    }

}
