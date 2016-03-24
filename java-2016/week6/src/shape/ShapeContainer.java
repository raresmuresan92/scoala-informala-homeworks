package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer implements Shape {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape(Shape shape){
		shapes.add(shape);
	}

	@Override
	public float calculateArea() {
		float result = 0;
		for(Object o: shapes){
			Shape s = (Shape)o;
			result = result+s.calculateArea();
		}
		return result;
	}

	@Override
	public float calculatePerimeter() {
		float result = 0;
		for(Object o: shapes){
			Shape s = (Shape)o;
			result = result+s.calculatePerimeter();
		}
		return result;
	}
}
