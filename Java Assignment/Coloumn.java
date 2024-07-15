import java.util.Scanner;
public class Coloumn{
public static void main(String[] args){
int[] array = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("enter 5 elements in array:");
for(int i=0;i<5;i++)
{
array[i] = sc.nextInt();
}
System.out.println("coloumn wise display:");
for(int i=0;i<5;i++)
{
System.out.print(array[i]+" ");
}
}
}