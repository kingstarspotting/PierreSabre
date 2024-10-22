package personnages;

public class Yakuza extends Humain {
	private String gang;
	private int reputation = 4;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String gang) {
		super(nom, boissonFavorite, argent);
		this.gang = gang;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argent = victime.seFaireExtorquer();
		gagnerArgent(argent);
		parler("J'ai pique les " + argent + " sous de " + victime.getNom() + ", ce qui me fait " + getArgentPossedee() + " sous dans ma poche. Hi ! Hi !");		
	}
	
	public int perdre() {
		int argent = getArgentPossedee();
		perdreArgent(argent);
		reputation -= 1;
		parler("J'ai perdu mon duel, mes "+ argent + " sous, snif... J'ai déshonoré le clan de " + gang + ".");
		return argent;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pendait vraiment battre " + getNom() + " du clan de " + gang + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	
	
	
}