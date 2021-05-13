package question3;

public class Polygon {
	int side =0;
    String color = "yellow";
    public Polygon(int s, String c ) {
    	 side = s;
    	 color = c;
    }
    public void printSide() {
    	System.out.println(side);
    }
    public void printColor() {
    	System.out.println(color);
    } 

}
