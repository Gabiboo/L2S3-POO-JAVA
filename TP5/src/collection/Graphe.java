package collection;
import java.util.HashMap;

public class Graphe 
{
    private HashMap <String, HashMap <String,Integer>> graphe ;
    
    public Graphe (){
        graphe = new HashMap <String, HashMap <String,Integer>> () ;
    }

    public void ajouterSommet(String s) throws Exception{
        if(graphe.containsKey(s))
            throw new Exception("Le sommet " + s + " existe déjà") ;
        graphe.put(s, new HashMap <String,Integer>()) ; 
    }

    
    public void ajouterChemin(String s1, String s2, Integer distance) throws Exception{
        if(!graphe.containsKey(s1))
            ajouterSommet(s1) ;
        if(!graphe.containsKey(s2))
            ajouterSommet(s2) ;
        if(!graphe.get(s1).containsValue(s2))
            graphe.get(s1).put(s2,distance) ;
    }

    public void ajouterDistance(String s1, String s2, float distance){

    }

    public String toString () {
        return graphe.toString() ;
    }
    
    public int distance(String s1, String s2) throws Exception{
        return 0;
    }

}