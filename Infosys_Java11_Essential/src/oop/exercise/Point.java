package oop.exercise;


class Point {

	private double x;
	private double y;

	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Method to obtain distance of a point w.r.t origin
	public double distance() {
		double xDiff=this.x;
		double yDiff=this.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}

	// Method to obtain distance of a point w.r.t another point
	public double distance(Point point) {
		
		return distance();
	}

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		System.out.println(p1.distance(p1));
		Point p2 = new Point(5, 6);
	}
}
