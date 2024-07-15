import java.util.Scanner;
public class Largestoften{
public static void main(String[] args){
int[] array = new int[10];
int largest = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the elements in array:");
for(int i=0;i<10;i++)
{
array[i] = sc.nextInt();
}
for(int i=0;i<10;i++)
{
if(array[i]>largest)
{
largest = array[i];
System.out.println("largest in :"+i+"th is:"+largest);
}
}
}
}