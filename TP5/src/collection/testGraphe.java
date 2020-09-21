package collection;

public class testGraphe {

	public static void main(String[] args) throws Exception{
		Graphe g = new Graphe();
		g.ajouterSommet("B");
		g.ajouterSommet("A");
		g.ajouterChemin("A", "B", 5);
		System.out.println(g.toString());
	
		GrapheNonPondere gg = new GrapheNonPondere();
		gg.ajouterSommet("E");
		gg.ajouterSommet("F");
		gg.ajouterChemin("E", "F");
		System.out.println(g.toString());
	}

}
