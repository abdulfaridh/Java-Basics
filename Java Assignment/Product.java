import java.util.Scanner;
public class Product{
public static void main(String[] args){
int num1,num2,num3,ans;
Scanner sc = new Scanner(System.in);
System.out.println("enter the 3 num's:");
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();
ans = num1*num2*num3;
System.out.println(ans);
}
}
