class VotingMachine{
	int count,age;
	int x=10;
	String name[];
	void Addcandidate(String []name)
	{
		for (int i=0;i<x ;i++ ) 
		{
			this.name[i]=name[i];
		}
	}
	void castVote(int age,String name)
	{
		for (int i=0;i<x;i++ ) 
		{
			if (this.name[i]==name)
			{
				System.out.print("NAME:" +name+ "VOTE:" +count);
			}
			this.age=age;
		}
	}
}
class InvalidAge extends Exception{
	InvalidAge(String s)
	{
		super(s);
	}
}
class Main{
	public static void main(String[] args) {
		int age=17;{
			try{
				if(age<18){
					throw new InvalidAge("invalid age");
				}
			}
			catch(InvalidAge i){
				System.out.print(i.getMessage());
			}
		}
	}
}