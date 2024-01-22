package Geometry;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
	
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radius*2);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

}
