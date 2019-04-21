import java.util.*;
class Task4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number:");
int num1=sc.nextInt();
System.out.println("enter a operator:");
int ch=sc.next() .charAt(0);
System.out.println("enter 2nd number:");
int num2=sc.nextInt();
switch(ch){
case '+':
System.out.println("sum="+(num1+num2));
break;
case '-':
System.out.println("subtraction="+(num1-num2));
break;
case '*':
System.out.println("multiplication="+(num1*num2));
break;
case '/':
float div=(float)num1/num2;
System.out.println("division="+div);
break;
default:
}
}
}