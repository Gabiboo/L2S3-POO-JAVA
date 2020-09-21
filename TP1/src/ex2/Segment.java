package ex2;

public class Segment {

	private Point a;
	private Point b;
	
	public Segment(Point c, Point d) {
		/*this.a = c;
		this.b = d;*/
		a = new Point(c.getX(), c.getY());
		b = new Point(d.getX(), d.getY());
		
	}
	
	public Segment(double x1, double x2, double y1, double y2) {
		this.a = new Point(x1,y1);
		this.b = new Point(x2,y2);
	}

	public void affiche() {
		System.out.println("[(" + this.a.getX() + "," + this.a.getY() + ") , ( " + this.b.getX() + "," + this.b.getY() + ")]");
	}
	
	
}
