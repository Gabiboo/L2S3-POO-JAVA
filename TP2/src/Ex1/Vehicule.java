package Ex1;

public class Vehicule extends Bien {
	
	private String numeroImmatriculation;
	private int nbPlaces;
	
	public Vehicule(int nbPlaces, String numeroImmatriculation, int val, int cout) {
		super(val, cout);
		this.nbPlaces = nbPlaces;
		this.numeroImmatriculation = numeroImmatriculation;
	}

	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}
	
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	public String getInfo() {
		return "Le numero d'immatriculation est : " + numeroImmatriculation + " , elle peut contenir " + nbPlaces + " personnes.";
		
	}
	
	
}
