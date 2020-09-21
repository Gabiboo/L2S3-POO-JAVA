package genericite;

public class testTriplet {

	public static void main(String[] args) {
		Triplet<Integer> monTriplet = new Triplet<Integer>(1, 2, 3);
		System.out.println(monTriplet);
		
		
		TripletH<Integer,String,Triplet<Integer>> T2 = new TripletH<Integer,String,Triplet<Integer>>(1, "A",monTriplet);
		System.out.println(T2);
	}

}
