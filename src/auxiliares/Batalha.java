package auxiliares;

import java.util.Scanner;

import monstros.Monstro;
import racas.Humano;

public class Batalha {
	
	public boolean batalhar(Humano jogador , Monstro monstro) {
		Scanner scanner = new Scanner(System.in);
		
		while(jogador.getHp() >= 0 && monstro.getHp() >= 0) {
			
			System.out.println("");
			jogador.printBatalha();
			System.out.println("");
			monstro.printBatalha();
			System.out.println("");
			System.out.println("Você deseja atacar ou defender?");
			System.out.println("1 - Atacar");
			System.out.println("2 - Defender");
			Integer escolhaUsuario = scanner.nextInt();
			System.out.println("");
			
			if(escolhaUsuario.equals(1)) {
				jogador.bater(monstro);
				monstro.bater(jogador);
			} else {
				int defesa = jogador.defender(monstro);
				int monstroHit = monstro.bater(jogador);
				if(monstroHit < defesa) {
					int novoHP = jogador.getHp() + monstroHit;
					jogador.setHp(novoHP);
				} else {
					int novoHP = jogador.getHp() + defesa;
					jogador.setHp(novoHP);
				}
			}
			
		}
		
		if(jogador.getHp() <= 0) {
			System.out.println("Jogador Morreu!");
			System.out.println("");
			return false;
		} else {
			System.out.println(monstro.getNome() + " morreu!");
			System.out.println("");
			return true;
		}
		
		
	}

}
