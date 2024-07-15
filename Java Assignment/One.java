import java.util.Scanner;
class Invoice{

String part_number;
String part_description;
int quantity;
double price_per_item;

public Invoice() {}

 public Invoice(String part_number, String part_description, int quantity, double price_per_item) {
        this.part_number = part_number;
        this.part_description = part_description;
        this.setquantity(quantity);
        this.setprice_per_item(price_per_item);
    }

public String getpart_number(){
return part_number;
}

public void setpart_number(String part_number){
this.part_number = part_number;
}

public String getpart_description(){
return part_description;
}

public void setpart_description(String part_description){
this.part_description = part_description;
}

public int getquantity(){
return quantity;
}

public void setquantity(int quantity){
if(quantity>0)
{
this.quantity = quantity;
}
else
{
this.quantity = 0;
}
}

public double getprice_per_item(){
return price_per_item;
}

public void setprice_per_item(double price_per_item){
if(price_per_item > 0)
{
this.price_per_item = price_per_item;
}
else
{
this.price_per_item = 0;
}
}

public double getInvoiceAmount() {
       return quantity * price_per_item;
    }
}

class One extends Invoice {
        public One(String part_number, String part_description, int quantity, double price_per_item) {
        super(part_number, part_description, quantity, price_per_item);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product details:");
        System.out.print("Enter the part number: ");
        String part_number = sc.nextLine();
        System.out.print("Enter the part description: ");
        String part_description = sc.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price per item: ");
        double price_per_item = sc.nextDouble();

        One invoice = new One(part_number, part_description, quantity, price_per_item);

        System.out.println("Part number: " + invoice.getpart_number());
        System.out.println("Part description: " + invoice.getpart_description());
        System.out.println("Quantity: " + invoice.getquantity());
        System.out.println("Price per item: " + invoice.getprice_per_item());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        invoice.setquantity(-10);
        invoice.setprice_per_item(-2);

        System.out.println("After changing the quantity and the price to negative:");
        System.out.println("Quantity: " + invoice.getquantity());
        System.out.println("Price per item: " + invoice.getprice_per_item());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        sc.close();
    }
}