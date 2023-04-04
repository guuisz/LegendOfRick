package auxiliares;

import java.util.Random;

public class Dado {
	
	public static double giraDadoAtaque() {
		Random random = new Random();
		
		double damage = 0;
		
		int num = random.nextInt(21);
		
		if(num == 0) {
			damage = 0;
		} else if(num >= 1 && num <= 3) {
			damage = 0.25;
		} else if (num >= 4 && num <= 6) {
			damage = 0.50;
		} else if (num >= 7 && num <= 9) {
			damage = 0.75;
		} else if (num >= 10 && num <= 12) {
			damage = 1;
		} else if(num >= 13 && num <= 15) {
			damage = 1.25;
		} else if(num >= 16 && num <= 18) {
			damage = 1.5;
		} else if(num == 19) {
			damage = 1.75;
		} else if(num >= 20) {
			damage = 2;
		}
		
		return damage;
	}
	
	public static double giraDadoDefesa() {
		Random random = new Random();
		
		double damage = 0;
		
		int num = random.nextInt(21);
		
		if(num == 0) {
			damage = 0;
		} else if(num >= 1 && num <= 3) {
			damage = 0.25;
		} else if (num >= 4 && num <= 6) {
			damage = 0.50;
		} else if (num >= 7 && num <= 9) {
			damage = 0.75;
		} else if (num >= 10 && num <= 12) {
			damage = 1;
		} else if(num >= 13 && num <= 15) {
			damage = 1.25;
		} else if(num >= 16 && num <= 18) {
			damage = 1.5;
		} else if(num == 19) {
			damage = 1.75;
		} else if(num >= 20) {
			damage = 2;
		}
		
		return damage;
	}

}