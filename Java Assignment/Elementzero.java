import java.util.Scanner;
public class Elementzero{
public static void main(String[] args){
int[] array = new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("enter the elements in array:");
for(int i=0;i<10;i++)
{
array[i] = sc.nextInt();
array[i] = 0;
}
System.out.println("array is:");
for(int i =0;i<10;i++)
{
System.out.println(array[i]);
}
}
}