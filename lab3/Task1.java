import java.util.*;
class Task1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of C++:");
int C=sc.nextInt();
System.out.println("Enter marks of Data Structures:");
int Dig=sc.nextInt();
System.out.println("Enter marks of Operating System:");
int oper=sc.nextInt();
long total=C+Dig+oper;
float percent=total/300f*100f;
System.out.println(percent+"\n");
if(percent>90){
System.out.println("Grade=A");
}
else if((percent<=90)&&(percent>=80)){
System.out.println("Grade=B");
}
else if((percent<=79)&&(percent>=70)){
System.out.println("Grade=C");
}
else if((percent<=69)&&(percent>=60)){
System.out.println("Grade=D");
}
else if(percent<=59){
System.out.println("Grade=FAIL");
}
}
}

