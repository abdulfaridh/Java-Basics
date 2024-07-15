import java.util.Scanner;
public class Multiple{
public static void main(String[] args){
int a,b;
System.out.println("Enter the nums:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
if(a%b == 0)
{
System.out.println("Multiple");
}
else
{
System.out.println("not a multiple");
}
}
}