package fases;

import monstros.Monstro;
import racas.Humano;

public interface Fase {
	
	void iniciaFase(Humano jogador);
	
	void terminaFase(int xp, boolean faseConcluida, Monstro monstroFase, Humano jogador);

}
