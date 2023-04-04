package monstros;

import java.util.Random;

import armaduras.Equipamento;
import armas.Arma;
import insignias.Insignia;
import itens.Item;
import pocoes.Pocao;
import racas.Humano;

public class Monstro {
	
	Random random = new Random();
	protected String nome;
	protected int hp;
	protected int mana;
	protected int str;
	protected int level;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Monstro(String nome, int hp, int mana, int str, int level) {
		this.nome = nome;
		this.hp = hp;
		this.mana = mana;
		this.str = str;
		this.level = level;
	}
	
	public Monstro() {
	}
	
	public int bater(Humano personagem) {
		int ataque = 0;
		return ataque;
	}
	
	public void printBatalha() {
		System.out.println("Nome: " + this.nome);
		System.out.println("HP: " + this.hp);
		System.out.println("Level: " + this.level);
	}
	
	public void dropaItem(Humano jogador) {
					
		}
	
	public void geraXP(int xp, Humano jogador) {
		
		int xpGerada = random.nextInt(xp) + this.getLevel();
		int xpAtribuida = jogador.getXp() + xpGerada; 
		jogador.setXp(xpAtribuida);
		
	}
	
}
