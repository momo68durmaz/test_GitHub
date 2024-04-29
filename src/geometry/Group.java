package geometry;

import java.util.ArrayList;

public class Group {
	 ArrayList<Shape> shapes = new ArrayList<>();
	 
	 /**
	  * fügt Shape hinzu
	  * @param shape
	  */
	    void addShape(Shape shape) {
	        shapes.add(shape);
	    }
	    
	    /**
	     * löscht Shape
	     * @param shape
	     */
	    void removeShape(Shape shape) {
	        shapes.remove(shape);
	    }
	    
	    /**
	     * berechnet Fläche
	     * @return
	     */
	    double calculateTotalArea() {
	        double totalArea = 0;
	        for (Shape shape : shapes) {
	            totalArea += shape.calculateArea();
	        }
	        return totalArea;
	    }
	    
	    /**
	     * berechnet den Umfang
	     * @return
	     */
	    
	    double calculateTotalCircumference() {
	        double totalCircumference = 0;
	        for (Shape shape : shapes) {
	            totalCircumference += shape.calculateCircumference();
	        }
	        return totalCircumference;
	    }
	    
	    /**
	     * berechnet die größte Fläche
	     * @return
	     */
	    Shape findLargestShape() {
	        if (shapes.isEmpty()) {
	            return null;
	        }
	        Shape largestShape = shapes.get(0);
	        for (Shape shape : shapes) {
	            if (shape.calculateArea() > largestShape.calculateArea()) {
	                largestShape = shape;
	            }
	        }

	        return largestShape;
	    }
	    
	    /**
	     * gibt alle Flächen aus
	     */
	    void printAllShapes() {
	        for (Shape shape : shapes) {
	            System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
	        }
	    }
}
