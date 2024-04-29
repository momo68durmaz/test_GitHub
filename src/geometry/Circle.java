package geometry;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
	
	/**
	 * berechnet die Fläche
	 */
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radius*2);
	}

	/**
	 * berechnet den Umfang
	 */
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
