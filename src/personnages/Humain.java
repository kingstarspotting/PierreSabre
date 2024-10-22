package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argentPossedee;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFav;
		this.argentPossedee = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgentPossedee() {
		return argentPossedee;
	}
	
	private void parler(String texte) {
		System.out.println("(" +nom + ")" + " - « " +  texte + " »");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + 
				" et j'aime boire du " + boissonFavorite + "!");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix ) {
		if (prix < argentPossedee) {
			parler("J'ai " + argentPossedee + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argentPossedee + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
		
	}
	
	private void gagnerArgent(int gain) {
		argentPossedee += gain;
	}
	
	private void perdreArgent(int perte) {
		argentPossedee -= perte;
	}
	
	
}
