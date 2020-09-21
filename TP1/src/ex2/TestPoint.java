package ex2;

import ex1.TestFraction;

public class TestPoint {
    
	private int testCount = 0;
    private int testFailed = 0;
    
    public static void main(String[] args) {
         (new TestPoint()).run();
    }
	
	
    public void run(){
		
		testBasic();
	}
	
	public void testBasic() {
		System.out.println("== Test origine" );
		
		Point p = new Point(3,2);
		check("Test origine.getX()", p.getX() == 3, "attendue: 3 / obtenu : "+ p.getX());
		check("Test origine.getYs()", p.getY() == 2, "attendue: 2 / obtenu : "+ p.getY());
		
		p.setX(5);
		p.setY(-3);
		check("new(5,-3).getX()", p.getX() == 5, "attendue: 5 / obtenu : "+ p.getX());
		check("new(5,-3).getY()", p.getY() == -3, "attendue: -3 / obtenu : "+ p.getY());
 	}



	private void check(String message, boolean condition, String debug) {
	    testCount++;
	    
	    if (! condition) {
	       System.out.print("[echec]\t");
	         testFailed++;
	    } else {
	       System.out.print("[ok]\t");
	  }
	
	    System.out.print(message+"\n");
	    if (! condition) {
	         System.out.println("---");
	         System.out.println(debug);
	         System.out.println("---");
	    }
	}

}