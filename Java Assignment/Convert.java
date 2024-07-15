import java.util.Scanner;
public class Convert{
public static void main(String[] args){
int Fahrenheit,celcius;
Scanner sc = new Scanner(System.in);
System.out.println("enter the Fahrenheit:");
Fahrenheit = sc.nextInt();
celcius = ((Fahrenheit - 32)*5) / 9;
System.out.println("celcius = "+celcius);
}
}