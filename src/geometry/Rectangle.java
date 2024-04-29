package geometry;

public class Rectangle extends Shape {
	double length;
    double width;
    
    Rectangle(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }
	
    /**
     * berechnet die Fläche
     */
	double calculateArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	
	/**
	 * berechnet den Umfang
	 */
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (this.length + this.width)*2;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
}

