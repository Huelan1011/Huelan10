package Baiktra01;

public class Circle {
private double radius = 1.0;

public Circle() {
	super();
	// TODO Auto-generated constructor stub
}
 public Circle(double radius) {
	if(radius <= 0) {
		throw new RuntimeException("Error");
	}
	this.radius = radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public double getArea() {
	double area = Math.pow(radius, 2)  * Math.PI;
	return area;
}

public double getCircumference() {
	double c = radius * 2 * Math.PI;
	return c;
}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Circle[radius="+radius+"]";
}
}


