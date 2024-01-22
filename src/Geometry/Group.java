package Geometry;

import java.util.ArrayList;

public class Group {
	 ArrayList<Shape> shapes = new ArrayList<>();

	    void addShape(Shape shape) {
	        shapes.add(shape);
	    }

	    void removeShape(Shape shape) {
	        shapes.remove(shape);
	    }

	    double calculateTotalArea() {
	        double totalArea = 0;
	        for (Shape shape : shapes) {
	            totalArea += shape.calculateArea();
	        }
	        return totalArea;
	    }

	    double calculateTotalCircumference() {
	        double totalCircumference = 0;
	        for (Shape shape : shapes) {
	            totalCircumference += shape.calculateCircumference();
	        }
	        return totalCircumference;
	    }

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

	    void printAllShapes() {
	        for (Shape shape : shapes) {
	            System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
	        }
	    }
}
