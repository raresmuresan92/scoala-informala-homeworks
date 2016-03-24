package shape;

public class Square implements Shape {
	
	float side;
	
	public Square(float side){
		this.side = side;
	}

	@Override
	public float calculateArea() {
		return side*side;
	}

	@Override
	public float calculatePerimeter() {
		return side*4;
	}

}
