package Geometry;

public class Rectangle extends Shape {
	double length;
    double width;
    
    Rectangle(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (this.length + this.width)*2;
	}
}

