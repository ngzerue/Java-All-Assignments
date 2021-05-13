package question3;

public class Main {

	public static void main(String[] args) {
		   Polygon triangle =new Polygon(3,"Red");
		   Polygon rectangle =new Polygon(4,"White");
		   Polygon polygon =new Polygon(5, "Black");
		   
		   triangle.printSide();
		   triangle.printColor();
		   
		   rectangle.printSide();
		   rectangle.printColor();
		   
		   polygon.printSide();
		   polygon.printColor();
		   
	}

}



