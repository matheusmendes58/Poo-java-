package view;

import java.util.Scanner;
import entidade.Curso;

public class Console {

	public void executa() {
		
		Scanner entrada = new Scanner(System.in);
		
		Curso ia = new Curso("12349", "Inteligencia Artificial");
		
		
		ia.setNotaProjeto(7);
		ia.setNotaAvaliacao1(1);
		ia.setNotaAvaliacao2(4);
		
		System.out.println("*** Relatorio final");
		System.out.println("Matricula: " + ia.getMatricula());
		System.out.println("Nome: " + ia.getNome());
		System.out.println("AV1: " + ia.getNotaAvaliacao1());
		System.out.println("AV2: " + ia.getNotaAvaliacao2());
		System.out.println("Projeto: " + ia.getNotaProjeto());
		System.out.println("Frequencia: " + ia.getFrequencia() + "%");
		System.out.println("***");
		System.out.println("Media: " + ia.getMedia());
		System.out.print("Situação: ");
		if (ia.aprovado())
			System.out.println("Aprovado");
		else 
			System.out.println("Reprovado");
		
		
		
		
		
		
		
		
		
	}
	
	
}
