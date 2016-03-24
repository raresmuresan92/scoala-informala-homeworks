package shape;

import static org.junit.Assert.*;


import org.junit.Test;



public class ShapeContainerTest {
	
	static class SimpleShape implements Shape{
		
		private int area;
		private int perimeter;
		

		public SimpleShape(int area, int perimeter) {
			super();
			this.area = area;
			this.perimeter = perimeter;
		}

		@Override
		public float calculateArea() {
			return area;
		}

		@Override
		public float calculatePerimeter() {
			return perimeter;
		}

	}
	
	@Test
	public void testEmptyArea(){
		ShapeContainer t = new ShapeContainer();
		assertEquals(0, t.calculateArea(), 0);
	}
	
	@Test
	public void testEmptyPerimeter(){
		ShapeContainer t = new ShapeContainer();
		assertEquals(0, t.calculatePerimeter(), 0);
	}
	
	@Test
	public void testOneShapeArea(){
			ShapeContainer t = new ShapeContainer();
			t.addShape(new SimpleShape(1,1));
			assertEquals(1, t.calculateArea(), 0);
	}
	
	@Test
	public void testMultipleShapesArea(){
			ShapeContainer t = new ShapeContainer();
			t.addShape(new SimpleShape(1,1));
			t.addShape(new SimpleShape(2,2));
			t.addShape(new SimpleShape(3,3));
			assertEquals(6, t.calculateArea(), 0);
	}
	
	@Test
	public void testOneShapePerimeter(){
			ShapeContainer t = new ShapeContainer();
			t.addShape(new SimpleShape(1,1));
			assertEquals(1, t.calculatePerimeter(), 0);
	}
	
	@Test
	public void testMultipleShapesPerimeter(){
			ShapeContainer t = new ShapeContainer();
			t.addShape(new SimpleShape(1,1));// \
			t.addShape(new SimpleShape(2,2));//  | => Amount equal to 6
 			t.addShape(new SimpleShape(3,3));// /
			t.addShape(new Circle(1));//Amount equal 2*Math.PI
			t.addShape(new Square(5));//Amount equal to 20
			t.addShape(new Triangle(3,5,9));//Amount equal to 17
			t.addShape(new Rectangle(2,4));// Amount equal to 12
			assertEquals(6+2*Math.PI+20+17+12, t.calculatePerimeter(), 0.001);
	}


}
