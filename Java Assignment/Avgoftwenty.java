import java.util.Scanner;
public class Avgoftwenty{
public static void main(String[] args){
int[] array = new int[20];
double avg;
System.out.println("enter th elements in array:");
Scanner sc = new Scanner(System.in);
for(int i = 0;i<20;i++)
{
array[i] = sc.nextInt();
if(array[i] == -1)
{
break;
}
}
avg = avgofarray(array);
System.out.println("avg is:"+avg);
}
public static double avgofarray(int[] array)
{
double average,sum=0;
for(int i =0;i<20;i++)
{
sum = sum+array[i];
}
average = sum/20;
return average;
}
}