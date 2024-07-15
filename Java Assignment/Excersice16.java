import java.util.Scanner;
class Date{
 int month;
 int day;
 int year;
 
 public Date(int month,int day,int year){
 this.month = month;
 this.day = day;
 this.year = year;
}

public int getmonth(){
return month;
}

public void setmonth(int month){
this.month = month;
}

public int day(){
return day;
}

public void setday(int day){
this.day = day;
}

public int getyear(){
return year;
}

public void setyear(int year){
this.year = year;
}

public String getdisplaydate(){
return String.format("%d/%d/%d",month,day,year);
}

}

public class Excersice16{
public static void main(String[] args)
{
int month;
int day;
int year;
 
Scanner sc = new Scanner(System.in); 

System.out.println("enter your month/day/year: ");
month = sc.nextInt();
day = sc.nextInt();
year = sc.nextInt();

Date d = new Date(month,day,year);
System.out.print("your input is:"+d.getdisplaydate());
}
}