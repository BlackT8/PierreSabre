package fr.blackt8.pierresabre.main;

import fr.blackt8.pierresabre.characters.Humain;
import fr.blackt8.pierresabre.characters.Commercant;
import fr.blackt8.pierresabre.characters.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Kombucha",54);
		Commercant marco = new Commercant("Marco",15);
		Yakuza yakulenoir = new Yakuza("Yaku Le Noir", "Warsong", "whisky",30);
		
		prof.direBonjour();
		prof.acheter("une boisson",12);
		prof.boire();
		prof.acheter("un jeu",2);
		prof.acheter("un kimono",50);
		
		System.out.println(" ");
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println(" ");
		
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
	}
	
	

}
