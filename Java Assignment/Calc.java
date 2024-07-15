import java.util.Scanner;
public class Calc{
public static void main(String[] args){
int a,b,sum,prod,div,sub,quo;
System.out.println("Enter the nums:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
sum = a+b;
sub = a-b;
prod = a*b;
div = a/b;
quo = a%b;
System.out.println("sum is:"+sum);
System.out.println("sub is:"+sub);
System.out.println("product is:"+prod);
System.out.println("div is:"+div);
System.out.println("quo is:"+quo);

}
}

