package Day_06_1_2026_OopsInheritance;

// Parent class
class Shape {
	int area;

}

class Triangle extends Shape {
	int b;
	int h;

	Triangle(int b, int h) {
		this.b = b;
		this.h = h;
		System.out.println("-----------");
		System.out.println("Base is: " + b);
		System.out.println("Height is: " + h);
		area = (int)(0.5* b * h);
		System.out.println("Area of Triangle is : " + area);
	}
}

class Circle extends Shape {
		int r;
		Circle(int r) {
			System.out.println("-----------");
			this.r = r;
			System.out.println("Radius: " + r);
			area = (int) (3.14 * r * r);
			System.out.println("Area of Circle is: "+area);
		}
	}


class Rectangle extends Shape {
	int l;
	int w;

	Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
		System.out.println("-----------");
		System.out.println("Length is: " + l);
		System.out.println("Widht is: " + w);
		area = l * w;
		System.out.println("Area Of Rect is: " + area);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(4,5);
		Triangle t= new Triangle(6,3);
		Circle c = new Circle(4);
		

	}
}

