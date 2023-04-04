package application;

import java.util.Scanner;

import auxiliares.Dado;
import fases.Fase;
import fases.Fase1;
import monstros.Javali;
import racas.Humano;

public class Main {

	public static void main(String[] args) {
		
		Humano jogador = new Humano();
		
		System.out.println("Bem vindo ao The Legend of Rick!");
		System.out.println("");
		
		jogador = new Humano("Rick","Homem");
		
		Fase fase1 = new Fase1() ;
		
		while(jogador.getLevel() == 1) {
		jogador.setHp(jogador.getMaxHP());
		jogador.setMana(jogador.getMaxMana());
		fase1.iniciaFase(jogador);
		}
	}

}
