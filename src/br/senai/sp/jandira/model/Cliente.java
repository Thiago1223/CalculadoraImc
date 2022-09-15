package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	public String nome;
	public LocalDate dataNascimento;
	public double altura;
	public double peso;
	
	public double getImc() {
		return peso / Math.pow(altura, 2);
	}
	
	public int getIdade() {
		
		Period p = Period.between(dataNascimento, LocalDate.now());
		return p.getYears();
		
	}
	
	public String getStatusImc() {
		
		if (getImc() <= 18.5) {
			return "Você está abaixo do peso!";
		} else if (getImc() > 18.5 && getImc() < 25.0) {
			return "Peso ideal!";
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return "Você está levemente acima do peso!";
		} else if (getImc() >= 30.0 && getImc() < 35.0) {
			return "Obesidade grau I";
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return "Obesidade grau II (severa)";
		} else {
			return "Obesidade grau III (mórbida)";
		}
		
	}
}
