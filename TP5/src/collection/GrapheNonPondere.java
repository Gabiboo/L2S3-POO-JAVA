package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class GrapheNonPondere {

	private HashMap<String,ArrayList<String>> leGraphe;

	public GrapheNonPondere() {
		leGraphe = new HashMap<String, ArrayList<String>>();
	}

	public void ajouterSommet(String s) throws Exception {
		if(leGraphe.containsKey(s))
			throw new Exception("Le sommet " + s + " existe déjà");
		leGraphe.put(s, new ArrayList<String>());
	}
	
	public void ajouterChemin(String s1, String s2) throws Exception {
		if(!leGraphe.containsKey(s1))
			ajouterSommet(s1);
		if(!leGraphe.containsKey(s2))
			ajouterSommet(s2);
		if(!leGraphe.get(s1).contains(s2))
			leGraphe.get(s1).add(s2);
			//leGraphe.put(s1,s2);
	}

	/*public String toString() {
		String grapheString = "";
		Set<String> lesCles = leGraphe.keySet();
		for(String cle : lesCles) {
			grapheString = grapheString.concat("<"+cle+",");
			if(leGraphe.get(cle)!= null) 
				grapheString = grapheString.concat(leGraphe.get(cle)+"> \n");
			else
				grapheString = grapheString.concat("-> \n");	
		}
		return grapheString;
	} */
	public String toString() {
		return leGraphe.toString();
	}

}
