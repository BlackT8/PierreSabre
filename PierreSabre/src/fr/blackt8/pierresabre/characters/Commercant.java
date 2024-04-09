	package fr.blackt8.pierresabre.characters;

public class Commercant extends Humain {

	public Commercant(String name, int argent) {
		super(name, "thé", argent);
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie généreux donateur");
	}
	
	public int seFaireExtorquer() {
		int total = getArgent();
		
		parler("J'ai tout perdu ! Le monde est trop injuste ...");
		perdreArgent(total);
		
		return total;
		
	}

}
