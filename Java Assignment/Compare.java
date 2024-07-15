import java.util.Scanner;
public class Compare{
public static void main(String[] args){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("enteer the num:");
a = sc.nextInt();
b = sc.nextInt();
if(a>b)
{
System.out.println(a+" is the largest");
}
else if(b>a)
{
System.out.println(b+" is the largest");
}
else
{
System.out.println("equal");
}
}
}

