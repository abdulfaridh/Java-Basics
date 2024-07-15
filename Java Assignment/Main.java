import java.util.Scanner;
class Employee
{
 String first_name;
 String last_name;
 double salary;

 

 public Employee(String first_name,String last_name,double salary)
{
 this.first_name = first_name;
 this.last_name = last_name;
 this.salary = salary;
}

 public String getfirst_name()
{
 return first_name;
}

 public void setfirst_name(String first_name){
 this.first_name = first_name;
}

public String getlast_name()
{
 return last_name;
}

 public void setlast_name(String last_name){
 this.last_name = last_name;
}

public double getsalary(){
return salary;
}

public void setsalary(double salary){
if(salary > 0){
this.salary = salary;
}
else{
this.salary = 0;
}
}

public double gethike(){
return (salary * 0.1f)+salary;
}
}

public class Main{
public static void main(String[] args) {
String first_name;
String last_name;
double salary;

Scanner sc = new Scanner(System.in);



System.out.println("enter the 2 employees details:");


System.out.println("enter the employee1 details:");
System.out.println("enter the First name:");
first_name = sc.nextLine();
System.out.println("enter the Last name:");
last_name = sc.nextLine();
System.out.println("enter emp salary:");
salary = sc.nextDouble();

sc.nextLine();

System.out.println("enter the employee2 details:");
System.out.println("enter the First name:");
first_name = sc.nextLine();
System.out.println("enter the Last name:");
last_name = sc.nextLine();
System.out.println("enter emp salary:");
salary = sc.nextDouble();

Employee e1 = new Employee(first_name,last_name,salary);
Employee e2 = new Employee(first_name,last_name,salary);

System.out.println("First name of employee 1 :"+e1.getfirst_name());
System.out.println("Last name of employee 1 :"+e1.getlast_name());
System.out.println("Salary before hike:"+e1.getsalary());
System.out.println("Salary after hike:"+e1.gethike());

System.out.println("First name of employee 2 :"+e2.getfirst_name());
System.out.println("Last name of employee 2 :"+e2.getlast_name());
System.out.println("Salary before hike:"+e2.getsalary());
System.out.println("Salary after hike:"+e2.gethike());

}
}


