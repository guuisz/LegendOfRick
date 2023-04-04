package racas;

import java.util.ArrayList;
import java.util.List;

import armaduras.Equipamento;
import armas.Arma;
import auxiliares.Dado;
import insignias.Insignia;
import itens.Item;
import monstros.Monstro;
import pocoes.Pocao;

public class Humano {
	
	private String nome;
	private String sexo;
	private int hp;
	private int maxHP;
	private int str;
	private int def;
	private int mana;
	private int maxMana;
	private int xp;
	private int level;
	private int xpProximoNivel;
	private int estoqueOuro;
	private List<Arma> arsenalDeArmas;
	private List<Equipamento> arsenalDeEquipamento;
	private List<Item> itens;
	private List<Pocao> pocoes;
	private List<Insignia> insignias;
	
	
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getXpProximoNivel() {
		return xpProximoNivel;
	}
	public void setXpProximoNivel(int xpProximoNivel) {
		this.xpProximoNivel = xpProximoNivel;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getMaxMana() {
		return maxMana;
	}
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	
	public int getEstoqueOuro() {
		return estoqueOuro;
	}
	public void setEstoqueOuro(int estoqueOuro) {
		this.estoqueOuro = estoqueOuro;
	}
	public List<Arma> getArsenalDeArmas() {
		return arsenalDeArmas;
	}
	public void setArsenalDeArmas(List<Arma> arsenalDeArmas) {
		this.arsenalDeArmas = arsenalDeArmas;
	}
	public List<Equipamento> getArsenalDeEquipamento() {
		return arsenalDeEquipamento;
	}
	public void setArsenalDeEquipamento(List<Equipamento> arsenalDeEquipamento) {
		this.arsenalDeEquipamento = arsenalDeEquipamento;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public List<Pocao> getPocoes() {
		return pocoes;
	}
	public void setPocoes(List<Pocao> pocoes) {
		this.pocoes = pocoes;
	}
	public List<Insignia> getInsignias() {
		return insignias;
	}
	public void setInsignias(List<Insignia> insignias) {
		this.insignias = insignias;
	}
	
	public Humano(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.maxHP = 50;
		this.maxMana = 50;
		this.str = 10;
		this.level = 1;
		this.xp = 0;
		this.xpProximoNivel = 20;
		this.estoqueOuro = 0;
		this.arsenalDeArmas = new ArrayList<>();
		this.arsenalDeEquipamento = new ArrayList<>();
		this.itens = new ArrayList<>();
		this.pocoes = new ArrayList<>();
		this.insignias = new ArrayList<>();
	}
	
	public Humano() {
	}
	
	@Override
	public String toString() {
		return "Humano [nome=" + nome + ", sexo=" + sexo + ", hp=" + hp + ", str=" + str + ", mana=" + mana + "]";
	}
	
	public void bater(Monstro monstro) {
		System.out.println("Humano bateu");
		int hit = (int) (this.str * Dado.giraDadoAtaque());
		System.out.println("O hit foi de " + hit + " no monstro " + monstro.getNome());
		int novoHP = monstro.getHp() - hit; 
		monstro.setHp(novoHP);
	}
	
	public int defender(Monstro monstro) {
		System.out.println("Humano defendeu!");
		int defesa = (int) (this.str * Dado.giraDadoDefesa());
		System.out.println("A defesa foi de " + defesa);
		return defesa;
	}
	
	public void levelUP() {
		System.out.println("O jogador upou de nivel!");
		
		int acumuloXP = 0;
		
		if(this.xp > this.xpProximoNivel) {
			acumuloXP = this.xp - this.xpProximoNivel;
		}
		
		this.hp += 5;
		this.str += 2;
		this.mana += 5;
		this.xp = 0;
		this.xp += acumuloXP;
		this.level += 1;
		this.xpProximoNivel += 15;
	}
	
	public void printBatalha() {
		System.out.println("Nome: " + this.nome);
		System.out.println("HP: " + this.hp);
		System.out.println("Mana: " + this.mana);
		System.out.println("Level: " + this.level + " - " + "XP:" + this.xp + "/" + this.xpProximoNivel);
	}
	
}
