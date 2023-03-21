package area;

public class Area {
	
	final double length=25;
	double breadth;
	
	public Area(int length,int breadth){
	
		
		this.breadth=breadth;
		}
	
	public Area()
	{
		
	}

	void findArea()
	{
		double aor = length*breadth;
		System.out.println("Area of rectangle is "+aor);
	}
	
	void findPerimeter()
    {
        double peri;
        peri = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is : "+ peri);
    }
	
}
