    
class Count{
	public static int count;
	public Count(){
	count++;
	}
}
class CountObjects{
	public static void main(String[]args){
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		Count c5=new Count();
		System.out.println("number of Object:" +Count.count);
		
		
		

	}
}