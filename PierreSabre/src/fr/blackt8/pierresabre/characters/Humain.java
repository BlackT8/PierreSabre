package fr.blackt8.pierresabre.characters;

public class Humain {
	
	private String name;
	private String boissonFav;
	private int money;
	
	public Humain(String name, String boissonFav, int money) {
		super();
		this.name = name;
		this.boissonFav = boissonFav;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	private void parler(String texte) {
		System.out.println(this.name+" : "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+this.name+" et j'aime boire du "+this.boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+this.boissonFav+" ! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		this.money += gain;
	}
	
	private void perdreArgent(int perte) {
		this.money -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(this.money>=prix) {
			parler("J'ai "+this.money+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			this.perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+this.money+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}

}
