import java.util.Scanner;
public class Volumeofsphere{
public static void main(String[] args){
double r,vol;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of the sphere");
r = sc.nextDouble();
vol = volofsph(r);
System.out.println("volume of sphere:"+vol);
}
public static double volofsph(double radius){
double volume;
volume = (4.0 / 3.0)*Math.PI*Math.pow(radius,3);
return volume;
}
}
