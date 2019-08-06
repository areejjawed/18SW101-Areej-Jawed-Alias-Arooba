class Circle{
	private double radius;
	private String colour;
	public Circle(){
		this.radius=1.0;
		this.colour="red";
	}
	public Circle(double radius){
		this.radius=radius;
		this.colour="red";
	}
	public Circle(double radius,String colour){
		this.radius=radius;
		this.colour=colour;
	}
	public double getRadius(){
		return this.radius;
	}
	public String getColour(){
		return this.colour;
	}
	public void setRadius(double radius){
		this.colour=colour;
	}
	public String toString(){
		return "Circle[radius= " + radius + ", colour= " + colour + "]";
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
}
class Cylinder extends Circle{
	private double height;
	public Cylinder(){
		super();
				this.height=1.0;
			}
			public Cylinder(double height){
				super();
				this.height=height;
			}
			public Cylinder(double height,double radius){
				super(radius);
				this.height=height;
			}
			public Cylinder(double height,double radius,String colour){
				super(radius,colour);
				this.height=height;
			}
			public double getHeight(){
				return this.height;
			}
			public void setHeight(double height){
				this.height=height;
			}
			public double getVolume(){
				return getArea()*height;
			}
			public String toString(){
				return "this is Cylinder";
			}
		}	
 		class Task1{
			public static void main(String[] args) {
				Cylinder cy1 =new Cylinder();
				System.out.println("Radius is " + cy1.getRadius()
					+ " Height is " + cy1.getHeight()
					+ " Colour is "+  cy1.getColour()
					+ " Base area is " +cy1.getArea()
					+" Volume is "+ cy1.getVolume());
			}
		}	