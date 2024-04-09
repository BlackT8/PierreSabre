package fr.blackt8.pierresabre.characters;
import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	private Random rdm = new Random();

	public Traitre(String name, String seigneur, String boisson, int argent) {
		super(name,seigneur,boisson,argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+niveauTraitrise+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise>=3) {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer");
		}else {
			int argentRanconner = commercant.getArgent()*2/10;
			gagnerArgent(argentRanconner);
			commercant.perdreArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir me payer ! Donne moi "
					+argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+getName()+".");	
			niveauTraitrise++;
			
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}else {
			int don = argent*1/20;
			Humain ami = super.connaissances[rdm.nextInt(nbConnaissance)];
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "
					+ami.getName()+".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			ami.gagnerArgent(don);
			super.perdreArgent(don);
			ami.parler("Merci "+name+" vous êtes quelqu'un de bien.");
			if(niveauTraitrise>1) {
				niveauTraitrise--;
			}
		}
	}

}
