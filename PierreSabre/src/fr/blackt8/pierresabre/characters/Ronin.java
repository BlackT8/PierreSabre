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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if(force>=adversaire.getReputation()){
			parler("Je t'ai eu petit yakusa !");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(getArgent());
		}
	}

}
