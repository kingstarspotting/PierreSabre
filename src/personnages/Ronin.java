package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner = getArgentPossedee() / 10;
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
		perdreArgent(argentDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
			int argent = adversaire.perdre();
			gagnerArgent(argent);
			honneur += 1;
		} else {
			int argent = getArgentPossedee();
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argent);
			perdreArgent(argent);
			honneur -= 1;
			
		}
	}
}