package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameCalculadoraImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculadoraImc tela = new FrameCalculadoraImc();
		tela.titulo = "Calculadora IMC";
		tela.largura = 600;
		tela.altura = 600;
		tela.criarTela();
		
		Cliente maria = new Cliente();
		maria.nome = "Maria Antonieta";
		maria.peso = 57;
		maria.altura = 1.67;
		maria.dataNascimento = LocalDate.of(2000, 1, 10);
		
		System.out.println(maria.getImc());
		System.out.println(maria.getIdade());
		System.out.println(maria.getStatusImc());
		
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Alvares Cabral";
		pedro.peso = 78.5;
		pedro.altura = 1.74;
		pedro.dataNascimento = LocalDate.of(1996, 9, 30);
		
		System.out.println(pedro.getImc());
		System.out.println(pedro.getIdade());
		System.out.println(pedro.getStatusImc());
		
		String teste = pedro.getStatusImc();
		System.out.println("Teste vale " + teste);

	}

}
