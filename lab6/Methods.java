class Methods{
	public void disp(char c,int num){
		System.out.println("Char :" + c + " " + " Integer: " +num);
	}
	public void disp(int num ,char c)
	{
		System.out.println("integer: " + num + " " + " Char: " +c);
	}
}
class Task3{
	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.disp('x',2);
		obj.disp(5,'h');
	}
}