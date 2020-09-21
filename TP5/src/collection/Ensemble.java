package collection;

import java.util.ArrayList;

public class Ensemble {

	private ArrayList<Integer> elements; //Ensemble d'entiers

	
	public Ensemble() {
        this.elements = new ArrayList<Integer>();
    }
	
	
	public void ajoute(Integer a) {
		this.elements.add(a);
	}

	public int taille() {
		return this.elements.size();
	}
	
	public Integer getElement(int i) throws Exception {
		if(i >= this.taille() && i > 0)
			throw new Exception("taille dépassée ou taille trop petite.......");
		return this.elements.get(i);

	}
	
	public String toString() {
		return this.elements.toString();
	}
	
	
	public boolean contains(int i) {
		return this.elements.contains(i);
	}
	
	public ArrayList<Integer> getElements(){
		return this.elements;
	}
	
	
	
	/**Renvoie l'union de l'ensemble et d'un autre ensemble passe en parametre
	     * @param e l'ensemble en parametre
	     * @return u l'ensemble union
	     */
	public Ensemble union(Ensemble x) {
		Ensemble resultat = new Ensemble();
		//mettre tous les elements de this.ensemble
		for(int i : this.elements) {
			resultat.ajoute(i);
		}
		//ajouter à résultat tous les éléments de e.elements
		for(int i : x.getElements()) {
			resultat.ajoute(i);
		}
		return resultat;
	}
	
	
	
	public Ensemble intersection(Ensemble e) {
		Ensemble resultat = new Ensemble();
		for(int i : this.elements) {
			if(e.elements.contains((i))) // on verifie un par un si il existe sinon on l'ajoute
				resultat.ajoute(i);
		}
		return resultat;
	}
	
}
