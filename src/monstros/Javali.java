package monstros;

import armaduras.Equipamento;
import armas.Arma;
import auxiliares.Dado;
import insignias.Insignia;
import itens.Item;
import pocoes.Pocao;
import racas.Humano;

public class Javali extends Monstro{
	
	public Javali(String nome, int hp, int mana, int str, int level) {
		super(nome, hp, mana, str, level);
		// TODO Auto-generated constructor stub
	}

	public int bater(Humano personagem) {
		System.out.println("Javali bateu");
		int hit = (int) (this.str * Dado.giraDadoAtaque());
		int novoHP = personagem.getHp() - hit; 
		personagem.setHp(novoHP);
		System.out.println("O hit foi de " + hit + " no humano " + personagem.getNome());
		return hit;
	}
	
	public void dropaItem(Humano jogador) {
		int dropNum = random.nextInt(101);
		
		if(dropNum == 0) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);

		}
		else if(dropNum >= 1 && dropNum <= 25) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);

		}
		else if(dropNum >= 26 && dropNum <= 50) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);
			
			System.out.println("Voce ganhou uma costela de porco!");
			Item costelaDePorco = new Item();
			jogador.getItens().add(costelaDePorco);
			
		}
		
		else if(dropNum >= 51 && dropNum <= 75) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);
			
			System.out.println("Voce ganhou uma costela de porco!");
			Item costelaDePorco = new Item();
			jogador.getItens().add(costelaDePorco);
			
			System.out.println("Voce ganhou um equipamento!");
			Equipamento equipamento = new Equipamento();
			jogador.getArsenalDeEquipamento().add(equipamento);
			
		}
		
		else if(dropNum >= 76 && dropNum <= 99) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);
			
			System.out.println("Voce ganhou uma costela de porco!");
			Item costelaDePorco = new Item();
			jogador.getItens().add(costelaDePorco);
			
			System.out.println("Voce ganhou um equipamento javali!");
			Equipamento equipamento = new Equipamento();
			jogador.getArsenalDeEquipamento().add(equipamento);
			
			System.out.println("Voce ganhou a espada javali!");
			Arma arma = new Arma();
			jogador.getArsenalDeArmas().add(arma);
					
		}
		
		else if(dropNum >= 76 && dropNum <= 99) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);
			
			System.out.println("Voce ganhou uma costela de porco!");
			Item costelaDePorco = new Item();
			jogador.getItens().add(costelaDePorco);
			
			System.out.println("Voce ganhou um equipamento javali!");
			Equipamento equipamento = new Equipamento();
			jogador.getArsenalDeEquipamento().add(equipamento);
			
			System.out.println("Voce ganhou a espada javali!");
			Arma arma = new Arma();
			jogador.getArsenalDeArmas().add(arma);
					
		}
		
		else if(dropNum == 100) {
			System.out.println("Printando os drops!");
			
			System.out.println("Você ganhou 5 de ouro!");
			int ouroTotal = jogador.getEstoqueOuro() + 5;
			jogador.setEstoqueOuro(ouroTotal);
			
			System.out.println("Você ganhou uma pocao de HP!");
			Pocao pocao = new Pocao();
			jogador.getPocoes().add(pocao);
			
			System.out.println("Voce ganhou uma costela de porco!");
			Item costelaDePorco = new Item();
			jogador.getItens().add(costelaDePorco);
			
			System.out.println("Voce ganhou um equipamento javali!");
			Equipamento equipamento = new Equipamento();
			jogador.getArsenalDeEquipamento().add(equipamento);
			
			System.out.println("Voce ganhou a espada javali!");
			Arma arma = new Arma();
			jogador.getArsenalDeArmas().add(arma);
			
			System.out.println("Voce ganhou a insignia javali!");
			Insignia insingnia = new Insignia();
			jogador.getInsignias().add(insingnia);
		}
		
	}
	
	@Override
	public String toString() {
		return "Javali [nome=" + nome + ", hp=" + hp + ", mana=" + mana + ", str=" + str + "]";
	}
	
}
