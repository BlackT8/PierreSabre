package fr.blackt8.pierresabre.characters;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String name, String boisson, int argent) {
		super(name,boisson,argent);
		this.honneur = 1;
	}
	
	public int getHonneur() {
		return honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()*10/100;
		perdreArgent(don);
		parler(beneficiaire.getName()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}

}
