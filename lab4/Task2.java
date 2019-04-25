import java.util.*;
class Task2{
	public static void main(String[] args) {
		int t,s,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table");
		t=sc.nextInt();
		System.out.println("enter starting point");
		s=sc.nextInt();
		System.out.println("enter end point");
		e=sc.nextInt();
		int result;
		for (int i=s;i<=e ;i++ ) {
			result=t*i;
			System.out.println(t+ "x"+ i+"=" +result);
		}
	
			
		}
	}
