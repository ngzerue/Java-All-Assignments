package question5;

public class Polygon {
	int side=0;
    String color ="white";
   // int height =8 ;
    public Polygon(int s, String c ) {
   	 side = s;
   	 color = c;
   	// height= h;
   }
    public void printSide() {
    	System.out.println(side);
    }
    public void printColor() {
    	System.out.println(color);
    } 
    
    
	
}
