package vought;

public class BillyCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

	public void activateDurability(Hero hero) {
		hero.setEnergy(100);
		System.out.println("Ganhei energia demais!");
	}

	public void giveStrenght(Hero hero) {

	}

	public void maxSpeed(Hero hero) {

	}

	public void fly(Hero hero) {

	}

	public void usePower(Hero hero) {

	}

}
