package shape;

public class Triangle implements Shape {
	
	float side1;
	float side2;
	float side3;
	
	public Triangle(float side1, float side2, float side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public float calculateArea() {
		return (side1*side2)/side3;
	}

	@Override
	public float calculatePerimeter() {
		return side1+side2+side3;
	}

}
