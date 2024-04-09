package fr.blackt8.pierresabre.characters;

public class Humain {
	
	private String name;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance = 0; 
	private int maxConnaissances = 30;
	private Humain[] connaissances = new Humain[maxConnaissances];
	
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
	
	public void memoriser(Humain humain) {
		if(nbConnaissance == maxConnaissances) {
			for(int i=0; i<maxConnaissances - 1;i++) {
				connaissances[i]=connaissances[i+1];
			}
			connaissances[maxConnaissances - 1]=humain;
		}else {
			connaissances[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissance(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		StringBuilder stringb = new StringBuilder("Je connais beaucoup de monde dont : ");
		stringb.append(connaissances[0].getName());
		for(int i=1;i<nbConnaissance;i++) {
			stringb.append(", ");
			stringb.append(connaissances[i].getName());
		}
		System.out.println(stringb);
	}

}
