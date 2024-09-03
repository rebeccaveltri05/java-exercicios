package vought;

public class Hero extends Person {

	private String nickname;
	private int energy;
	private int strenght;
	private int speed;

	public Hero() {

	}

	public Hero(String nickname, int energy, int strenght, int speed) {
		this.nickname = nickname;
		this.energy = energy;
		this.strenght = strenght;
		this.speed = speed;
	}

	public Hero(Person person, String nickname, int energy, int strenght, int speed) {
		super(person.getName(), person.getSurname());
		this.nickname = nickname;
		this.energy = energy;
		this.strenght = strenght;
		this.speed = speed;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
