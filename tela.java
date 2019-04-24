package view;

import entidade.Clube;
import entidade.Partida;

public class tela {

	
	public void executar() {
		
		
		//adm crud partida 
		Clube vasco = new Clube("vaixco", "Rio de janeiro");
		Clube atletico = new Clube("Athletico", "Parana");
		Clube ibis = new Clube("ibis", "Pernambuco");

		
		
	
		
		//adm crud partida 
		Partida p1 = new Partida();
		p1.campeonato = "Copa do Brasil";
		p1.local = "Mineirão";
		p1.data = "11/06/2019";
		
		Partida p2 = new Partida();
		p2.campeonato = "Copa do Brasil";
		p2.local = "Arena da Baixada";
		p2.data = "10/06/2019";
		p2.host = atletico;
		p2.visitante = vasco;
		
		
		
		
		this.mostraPartida(p2);
		System.out.println("fim!");
		
		
	}
		
	private void mostraPartida(Partida p) {
		//System.out.println(p);
	   System.out.println( p.campeonato + ", " + p.local + ", "+ p.data);
	   System.out.println("Anfitrião: " + p.host.getNome());
	   System.out.println("Visitante: " + p.visitante.getNome());
	   
	}
	
	
}
