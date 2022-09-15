package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculadoraImc {
	
	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Obter uma referência do painel de conteúdo da tela
		Container painel = tela.getContentPane();
		painel.setBackground(Color.DARK_GRAY);
		
		// Criar os componentes de tela
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,50));
		labelImc.setForeground(Color.RED);
		labelImc.setBounds(30, 20, 100, 50);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setForeground(Color.LIGHT_GRAY);
		labelNome.setBounds(30, 70, 100, 30);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 100, 200, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setForeground(Color.LIGHT_GRAY);
		labelPeso.setBounds(30, 140, 100, 30);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 170, 200, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setForeground(Color.LIGHT_GRAY);
		labelAltura.setBounds(30, 210, 100, 30);
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 240, 200, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data de Nascimento:");
		labelDataNascimento.setForeground(Color.LIGHT_GRAY);
		labelDataNascimento.setBounds(30, 280, 200, 30);
		
		JTextField textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(30, 310, 200, 30);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("");
		labelResultadoImc.setForeground(Color.YELLOW);
		labelResultadoImc.setBounds(30, 380, 200, 30);
		
		JLabel labelSeuImcEsta = new JLabel();
		labelSeuImcEsta.setText("");
		labelSeuImcEsta.setForeground(Color.YELLOW);
		labelSeuImcEsta.setBounds(30, 430, 300, 30);
		
		JLabel labelSeuIdadeE = new JLabel();
		labelSeuIdadeE.setText("");
		labelSeuIdadeE.setForeground(Color.YELLOW);
		labelSeuIdadeE.setBounds(30, 480, 200, 30);
			
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(Color.LIGHT_GRAY);
		buttonCalcular.setBounds(450, 310, 100, 30);
		
		// Adicionar os componentes ao painel
		painel.add(labelImc);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(textFieldDataNascimento);
		painel.add(buttonCalcular);
		painel.add(labelResultadoImc);
		painel.add(labelSeuImcEsta);
		painel.add(labelSeuIdadeE);
		
		// Tornar a janela visível
		tela.setVisible(true);
		
		// Definir ouvintes/listeners para os componentes de tela
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());
				
				String[] dataNascimento = textFieldDataNascimento.getText().split("/");
				
				int dia = Integer.parseInt(dataNascimento[0]);
				int mes = Integer.parseInt(dataNascimento[1]);
				int ano = Integer.parseInt(dataNascimento[2]);
				
				cliente.dataNascimento = LocalDate.of(ano, mes, dia);
				
				labelResultadoImc.setText("IMC: " + cliente.getImc());
				labelSeuImcEsta.setText("STATUS IMC: " + cliente.getStatusImc());
				labelSeuIdadeE.setText("Idade: " + cliente.getIdade());
				
			}
		});
		
	}

}
