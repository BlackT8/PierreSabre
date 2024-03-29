package fr.blackt8.pierresabre.characters;

public class Humain {
	
	private String name;
	private String boissonFav;
	private int argent;
	
	public Humain(String name, String boissonFav, int argent) {
		super();
		this.name = name;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	public String getName() {
		return name;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println(name+" : "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+name+" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+" ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(argent>=prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			this.perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}

}
