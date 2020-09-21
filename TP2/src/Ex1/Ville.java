package Ex1;

public class Ville {

	private Bien[]tabBien;
	//private ArrayList<Bien> tabBien;
	
	
	public Ville(Bien[]t) {
		tabBien = t;
		//tabBien.addAll(t);
	}

	public String getInfo(int indice) {
		return tabBien[indice].getInfo();
		//return tabBien.get(indice).getinfo();
	}
	
	
	/*
	public void addBien(Bien b) {
		tabBien.add(b);
	}*/
	
	public int nbVehicules() {
		int nb = 0;
		for(int i = 0 ; tabBien.length > 1; i++) {
			if(tabBien[i] instanceof Vehicule) {
				nb++;
			}
		}
		return nb;
	}
	
	public String listBien() {
		String ch = " ";
		for(int i = 0;)
	}
	
	
	
}
