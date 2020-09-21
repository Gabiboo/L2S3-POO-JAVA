package Ex1;

public class Logement extends Bien{

	private int superficieAuSol;
	private int nbPersonnesLogees;
	
	public Logement(int superficieAuSol, int nbPersonnesLoges, int cout, int val) {
		super(cout, val);
		this.superficieAuSol = superficieAuSol;
		this.nbPersonnesLogees = nbPersonnesLoges;
	}
	
	public int getSuperficieAuSol() {
		return superficieAuSol;
	}
	
	public int getNbPersonnesLogees() {
		return nbPersonnesLogees;
	}
	

	public String getInfo() {
		return "La superficie au sol est de " + superficieAuSol + "m² , " + nbPersonnesLogees + " personnes vivent dans ce logement.";
		
	}

}
