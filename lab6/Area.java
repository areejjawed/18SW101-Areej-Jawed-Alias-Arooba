class Area{
	public void printArea(int x,int y)
	{
		System.out.println("Area of rectangle: ");
		System.out.println(x*y);
	}
	public void printArea(int x){
		System.out.println("Area of square: ");
		System.out.println(x*x);
	}
}
class Task4{
	public static void main(String[] args) {
		Area a=new Area();
		a.printArea(9,8);
		a.printArea(5);
	}
}