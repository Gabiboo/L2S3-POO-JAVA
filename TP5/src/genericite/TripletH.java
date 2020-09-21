package genericite;


public class TripletH<T,S,R>{
	private T premier;
	private S deuxieme;
	private R troisieme;

	public TripletH(T premier, S deuxieme, R troisieme) {
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}

	public T getPremier() {
		return premier;
	}

	public S getDeuxieme() {
		return deuxieme;
	}

	public R getTroisieme() {
		return troisieme;
	}
	
	public String toString() {
		return "TripletHybride [premier = " + premier + ", deuxieme = " + deuxieme + ", troisieme = " + troisieme + "]";
	}
}