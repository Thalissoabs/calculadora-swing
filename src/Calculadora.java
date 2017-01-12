

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	JButton botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9;
	JButton divisao, mutiplicacao, soma, subtracao, ponto, igual;
	JTextField entrada;
	String operacao;
	String numero;

	public Calculadora() {
		super();

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		entrada = new JTextField();
		Font fonte = new Font("serif", Font.BOLD, 30);
		entrada.setFont(fonte);
		entrada.setForeground(Color.BLUE);
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(4,4,5,5));

		botao0 = new JButton("0");
		botao1 = new JButton("1");
		botao2 = new JButton("2");
		botao3 = new JButton("3");
		botao4 = new JButton("4");
		botao5 = new JButton("5");
		botao6 = new JButton("6");
		botao7 = new JButton("7");
		botao8 = new JButton("8");
		botao9 = new JButton("9");
		divisao = new JButton("/");
		mutiplicacao = new JButton("*");
		soma = new JButton("+");
		subtracao = new JButton("-");
		ponto = new JButton(".");
		igual = new JButton("=");

		botao0.addActionListener(this);
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		botao5.addActionListener(this);
		botao6.addActionListener(this);
		botao7.addActionListener(this);
		botao8.addActionListener(this);
		botao9.addActionListener(this);
		divisao.addActionListener(this);
		mutiplicacao.addActionListener(this);
		soma.addActionListener(this);
		subtracao.addActionListener(this);
		ponto.addActionListener(this);
		igual.addActionListener(this);
		
		painel.add(botao7);
		painel.add(botao8);
		painel.add(botao9);
		painel.add(mutiplicacao);
		painel.add(botao4);
		painel.add(botao5);
		painel.add(botao6);
		painel.add(divisao);
		painel.add(botao1);
		painel.add(botao2);
		painel.add(botao3);
		painel.add(subtracao);
		painel.add(botao0);
		painel.add(ponto);
		painel.add(igual);
		painel.add(soma);

		c.add(BorderLayout.NORTH, entrada);
		c.add(BorderLayout.CENTER, painel);

		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculadora();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao0) {
			if(entrada.equals(0)){
				entrada.setText("0");
			}else{
				entrada.setText(entrada.getText() + "0");
			}
		} else if (e.getSource() == botao1) {
			entrada.setText(entrada.getText() + "1");
		} else if (e.getSource() == botao2) {
			entrada.setText(entrada.getText() + "2");
		} else if (e.getSource() == botao3) {
			entrada.setText(entrada.getText() + "3");
		} else if (e.getSource() == botao4) {
			entrada.setText(entrada.getText() + "4");
		} else if (e.getSource() == botao5) {
			entrada.setText(entrada.getText() + "5");
		} else if (e.getSource() == botao6) {
			entrada.setText(entrada.getText() + "6");
		} else if (e.getSource() == botao7) {
			entrada.setText(entrada.getText() + "7");
		} else if (e.getSource() == botao8) {
			entrada.setText(entrada.getText() + "8");
		} else if (e.getSource() == botao9) {
			entrada.setText(entrada.getText() + "9");
		} else if (e.getSource() == mutiplicacao) {
			numero = entrada.getText();
			entrada.setText("");
			operacao = "m";
		} else if (e.getSource() == divisao) {
			numero = entrada.getText();
			entrada.setText("");
			operacao = "d";
		} else if (e.getSource() == soma) {
			numero = entrada.getText();
			entrada.setText("");
			operacao = "s";
		} else if (e.getSource() == subtracao) {
			numero = entrada.getText();
			entrada.setText("");
			operacao = "su";
		} else if (e.getSource() == ponto) {
			entrada.setText(entrada.getText() + ".");
		} else if (e.getSource() == igual) {
			Double res;
			switch (operacao) {
			case "m":
				res = Double.parseDouble(numero) * Double.parseDouble(entrada.getText());
				numero= ""+res;
				operacao="";
				entrada.setText(res+"");
				res=0.0;
				break;
			case "d":
				res = Double.parseDouble(numero) / Double.parseDouble(entrada.getText());
				numero=""+res;
				operacao="";
				entrada.setText(res+"");
				res=0.0;
				break;
			case "s":
				res = Double.parseDouble(numero) + Double.parseDouble(entrada.getText());
				numero=""+res;
				operacao="";
				entrada.setText(res+"");
				res= 0.0;
				break;
			case "su":
				res = Double.parseDouble(numero) - Double.parseDouble(entrada.getText());
				numero=""+res;
				operacao="";
				entrada.setText(res+"");
				res=0.0;
			}

		}

	}

}
