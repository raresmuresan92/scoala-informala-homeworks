package shape;

public class Circle implements Shape {
	
	
	float radius;
	
	public Circle(float radius){
		this.radius = radius;
	}

	
	@Override
	public float calculateArea() {
		return (float)Math.PI*(radius*radius);
	}

	@Override
	public float calculatePerimeter() {
		return (float)(2*Math.PI*radius);
	}
	
}
