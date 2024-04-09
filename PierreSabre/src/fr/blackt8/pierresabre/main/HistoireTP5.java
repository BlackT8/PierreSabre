package fr.blackt8.pierresabre.main;

import fr.blackt8.pierresabre.characters.Commercant;
import fr.blackt8.pierresabre.characters.Ronin;
import fr.blackt8.pierresabre.characters.Yakuza;
import fr.blackt8.pierresabre.characters.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", "Warsong", 30);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "Miyamoto", "saké", 80);
		
		akimoto.boire("thé");
		


	}

}
