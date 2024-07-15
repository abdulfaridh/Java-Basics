import java.util.Scanner;
class Savingsaccount{
static int annual_interset;
double savingbalance;

public void monthlyinterest(double savingbalance, int annual_interest){
int monthly_interest = ((savingbalance*annual_interest)/12);
savingbalance += monthly_interest;
}

public static void modifyinterestrate(double newrate){
double annual_interest = newrate;
}

public duble getsavingsbalance{
return savingbalance;
}

public static void main(String[] args)
{
Savingsaccount saver1 = new Savingsaccount(2000.0);
Savingsaccount saver2 = new Savingsaccount(3000.0);

System.out.println("before annual interest of acc1: "+saver1.getsavingsbalance());
saver1.modifyinterestrate(0.04);
saver1.monthlyinterest();
System.out.println("after interest of 4% , acc2 balance is: "+ saver1.getsavingbalance()); 
System.out.println("before annual interest of acc2: "+saver2.getsavingsbalance());
saver2.modifyinterestrate(0.05);
saver2.monthlyinterest();
System.out.println("after interest of 5% , acc3 balance is: "+ saver2.getsavingbalance()); 
}
}