// TE 2337.0U1 - Homework 2 ex. 2 : Circle2D
// Programmer: Stephen-Michael Brooks
// Description:
// This program creates some circles and displays some attributes and some relationships between them.

public class Circle2D {
	// attributes
	private double x, y;			// center coordinates of circle
	private double radius;			// radius of circle
	
	// constructors
	Circle2D() {
		x = y = 0;
		radius = 1;
	}
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// accessors
	public double getX_coordinate() {
		return x;
	}
	public double getY_coordinate() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		// compute area
		double area = Math.PI * radius * radius;
		return area;
	}
	public double getPerimeter() {
		// compute circumference
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	public boolean contains(double x, double y) {
		// find distance between point and center of circle
		double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)); 
		if (distance < radius)
			return true;
		return false;
	}
	public boolean contains(Circle2D circle) {
		// find distance between old circle and new circle
		double distance = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2)); 
		if (distance < Math.abs(radius - circle.radius))
			// new circle contains circle 1
			return true;
		return false;
	}
	public boolean overlaps(Circle2D circle) {
		// find distance between old circle and new circle
		double distance = Math.sqrt(Math.pow((circle.x - x), 2) + Math.pow((circle.y - y), 2)); 
		if (distance > radius + circle.radius)
			// new circle overlaps circle 1
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);	// define circle 1
		// print attributes
		System.out.println("Circle 1 has an area of " + c1.getArea() + " and a circumference of " + c1.getPerimeter() + ".");
		
		// is point inside circle 1?
		System.out.print("Point P ");
		if (c1.contains(3, 3))
			System.out.println("is contained within circle 1.");
		else
			System.out.println("is not contained within circle 1.");
		
		// does a new circle contain old circle?
		System.out.print("Circle 1 ");
		if (c1.contains(new Circle2D(4, 5, 10.5)))
			System.out.println("is contained within circle 2.");
		else
			System.out.println("is not contained within circle 2.");
		
		// does a new circle overlap old circle?
		System.out.print("Circle 3 ");
		if (c1.overlaps(new Circle2D(3, 5, 2.3)))
			System.out.println("overlaps circle 1.");
		else
			System.out.println("does not overlap circle 1.");
	}

}
