class Task7{
	public static void main(String[] args) {
		String s="Habiba, 18, BE-software; Ansharah, 18, BE-software";
		String[]str=s.split(";");
		str[0]="Habiba, 18, BE-software";
		str[1]="Ansharah, 18, BE-software";
		String str1[]=str[0].split(",");
		String str2[]=str[1].split(",");
		System.out.println("STUDENT: 1");
		System.out.println("Name: "+str1[0]);
		System.out.println("Age:"+str1[1]);
		System.out.println("Program:"+str1[2]);
		System.out.println("STUDENT:2");
		System.out.println("Name: "+str2[0]);
		System.out.println("Age:"+str2[1]);
		System.out.println("Program:"+str2[2]);

	}
}