class BitwiseOperators{
	public static void main(String args[]){
	int a=4;
	int b=2;
	int c=0;
	c=a&b;
	System.out.println("the value of c for AND c=" +c);
	a=3;
	b=2;
	c=a|b;
	System.out.println("the value of c for OR c=" +c);
	a=3;
	b=1;
	c=a^b;
	System.out.println("the value of c for ^ c=" +c);
	a=3;
	c=a<<2;
	System.out.println("the value of c for left shift side c=" +c);
	c=a>>3;
	System.out.println("the value of c for right shift side c=" +c);

	}
}