package ex2;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean confondu(Point p) {
		if(p.getX() == x && p.getY() == y) {
			return true;
		}
		else
			return false;
	}
	
	public int distance(Point p) {
		
		int distancep = (int) Math.sqrt((this.x - p.getX()) + (this.y - p.getY()));
		return distancep;
	}
	
	
}
