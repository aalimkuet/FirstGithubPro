package labtest;

public class Vector implements VectorInterface{

	public int x , y;
  	
	  public Vector(int x, int y) {
        this.x=x;
        this.y=y;
		
	}
	  
	  
	public int len() {
		return x;
		
	}

	
	public double Magnitude() {
		
		return  Math.sqrt(x*x+y*y) ;
	}

	public double Theta() {
		
		return Math.atan(y/x);
	}

	public void ShowVector() {
		
		System.out.println("x = "+ x + "y = " + y);
	}
	

}
