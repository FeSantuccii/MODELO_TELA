package principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class Tela {
public static void main(String[] args) {
	
	JFrame frame = new JFrame("AWT Test"); //criação do frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 200); //tamanho da tela
	frame.setLayout(new BorderLayout());
	
	JLabel label1 = new JLabel("Label1"); //label1
	JTextField textField1 = new JTextField(15); //tamanho da caixa de texto (quanto maior, menor)
	
	JPanel topPanel = new JPanel();
	topPanel.setLayout(new FlowLayout());
	topPanel.add(label1);
	topPanel.add(textField1);
	
	JButton button1 = new JButton("Button 1"); //criação dos botões
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	
	JPanel buttonPanel = new JPanel(); //adicionar os botoes
	buttonPanel.setLayout(new FlowLayout()); 
	buttonPanel.add(button1);
	buttonPanel.add(button2);
	buttonPanel.add(button3);
	
	frame.add(topPanel, BorderLayout.NORTH); //posição dos botoes e panels
	frame.add(buttonPanel, BorderLayout.CENTER);
	
	frame.setVisible(true); //deixar visivel a tela
}
}