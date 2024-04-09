package fr.blackt8.pierresabre.characters;

public class Samourai extends Humain{
	private String seigneur;

	public Samourai(String name, String seigneur, String boisson, int argent) {
		super(name,boisson,argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Je suis fier de servir le seigneur "+seigneur);
	}
	
	public void boire(String boisson) {
		super.parler("Qu'est ce que je vais choisir comme boisson ? Tiens, je vais prendre du "+boisson);
	}

}
