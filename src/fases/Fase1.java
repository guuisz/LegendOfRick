package fases;

import java.util.Random;

import armaduras.Equipamento;
import armas.Arma;
import auxiliares.Batalha;
import insignias.Insignia;
import itens.Item;
import monstros.Javali;
import monstros.Monstro;
import monstros.Mosca;
import pocoes.Pocao;
import racas.Humano;

public class Fase1 implements Fase {
	
	Random random = new Random();
	
	public void iniciaFase(Humano jogador) {
	Random random = new Random();
	Monstro monstroFase = new Monstro();
	Batalha batalha = new Batalha();
	
	System.out.println("Fase 1 Iniciada!");
	
	int numeroMonstro = random.nextInt(2);
	
	switch(numeroMonstro) {
	case 0: monstroFase = new Javali("Javali",25,25,5,1);
			break;
	case 1: monstroFase = new Mosca("Mosca",25,25,5,1);
			break;
	}
	
	System.out.println("A batalha será contra o monstro " + monstroFase.getNome() + "!");
	
	boolean resultadoBatalha = batalha.batalhar(jogador, monstroFase);
	
	terminaFase(11,resultadoBatalha,monstroFase,jogador);
		
	}

	@Override
	public void terminaFase(int xp, boolean faseConcluida, Monstro monstroFase, Humano jogador) {
		if(faseConcluida == true) {
			
			monstroFase.geraXP(xp, jogador);
			
			monstroFase.dropaItem(jogador);
			
			System.out.println("Fase Concluída!");
			System.out.println("");
			
			
		} else {
			System.out.println("A fase não foi concluida :(");
		}
		
		if(jogador.getXp() >= jogador.getXpProximoNivel()) {
			jogador.levelUP();
		}
		
	}

}
