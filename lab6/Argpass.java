class Argpass{
	private static int a;
	public static void getinfo(){
		a=10;
		System.out.println(a);
	}
}
class Task6{
	public static void main(String[] args) {
		Argpass.getinfo();
	}
}