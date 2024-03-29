package fr.blackt8.pierresabre.characters;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String name, String clan, String boisson, int argent) {
		super(name,boisson,argent);
		this.clan = clan;
		this.reputation = 0;
		
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		reputation++;
		parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getName()+", si tu tiens à la vie donne moi ta bourse !");
		
		int sousVol = victime.seFaireExtorquer();
		gagnerArgent(sousVol);
		parler("J'ai piqué les "+sousVol+" sous de "+victime.getName()+", ce qui me fait "+sousVol+" sous dans ma poche. Hi! Hi!");
	}

}
