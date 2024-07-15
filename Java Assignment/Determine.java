import java.util.Scanner;
public class Determine{
public static void main(String[] args){
int a,b,c,sum,avg,prod;
System.out.println("Enter the nums:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
sum = a+b+c;
prod = a*b*c;
avg = sum/3;
System.out.println("sum is:"+sum);
System.out.println("prod is:"+prod);
System.out.println("avg is:"+avg);
if((a>b)&&(a>c))
{
System.out.print("a is the largest");
}
else if(b>c)
{
System.out.println("b is the largest");
}
else{
System.out.println("c is the largest");
}
if((a<b)&&(a<c))
{
System.out.print("a is the smallest");
}
else if(b<c)
{
System.out.println("b is the smallest");
}
else{
System.out.println("c is the smallest");
}
}
}
