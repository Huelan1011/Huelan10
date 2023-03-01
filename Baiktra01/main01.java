package Baiktra01;

import kethua_b1.circle;
import java.util.Scanner;
public class main01 {
 public static void main(String[] args) {
			// TODO Auto-generated method stub
			double radius;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter radius:");
			radius = sc.nextDouble();
			Circle c = new Circle(radius);
			System.out.println("Area:" + c.getArea());
			System.out.println("Circumfrence:" + c.getCircumference());
			c.toString();
		}
}