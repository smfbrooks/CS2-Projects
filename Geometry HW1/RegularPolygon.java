// TE 2337.0U1 - Homework 2 ex. 1 : RegularPolygon
// Programmer: Stephen-Michael Brooks
// Description:
// This program creates polygons and displays attributes of them.

public class RegularPolygon {
	// attributes of a polygon
	private int n;			// number of sides
	private double side;	// length of side
	private double x;		// x-coordinate of center
	private double y;		// y-coordinate of center
	
	// constructors
	RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	// accessors
	public void getCoords() {
		String coords = Double.toString(x) + Double.toString(y);
		System.out.println("The coordinates are (" + coords + ").");
	}
	public double getNumberOfSides() {
		return n;
	}
	public double getLengthOfSides() {
		return side;
	}
	public double getPerimeter() {
		// compute perimeter
		double perimeter = side * n;
		return perimeter;
	}
	public double getArea() {
		// compute area
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return area;
	}
	
	// mutators
	public void setLength(int n) {
		this.n = n;
	}
	public void setSides(double side) {
		this.side = side;
	}
	public void setCoords(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// main
	public static void main(String[] args) {
		// create polygons
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6, 4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// print polygon information
		System.out.println("Polygon 1 has a perimeter of " + p1.getPerimeter() + " and an area of " + p1.getArea() + ".");
		System.out.println("Polygon 1 has a perimeter of " + p2.getPerimeter() + " and an area of " + p2.getArea() + ".");
		System.out.println("Polygon 1 has a perimeter of " + p3.getPerimeter() + " and an area of " + p3.getArea() + ".");
	}

}
