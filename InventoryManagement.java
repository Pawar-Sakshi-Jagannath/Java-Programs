import java.util.*;
import java.text.DecimalFormat;
import java.time.LocalDate;

class Inventory
{
    String name;
    int quantity;
    double price;
    String date;
    String category;

    public Inventory(String name, int quantity, double price, String date, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.category = category;
    }

	public void display()
	{
		System.out.println("\n\tItem Name        :"+name);
		System.out.println("\n\tItem Quantity    :"+quantity);
		System.out.println("\n\tItem Price       :"+price);
		System.out.println("\n\tItem Category    :"+category);
		System.out.println("\n\tItem Expiry Date :"+date);
	}
}

class InventoryManagement
{
    public static void main(String args[]) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item name:");
        String item=sc.nextLine();
        System.out.println("Enter quantity of item :");
        int quantity = sc.nextInt();
        System.out.println("Enter price of item:");
        double price = sc.nextDouble();
        System.out.println("Enter expiration date :");
		String expiration=sc.nextLine();
        System.out.println("Enter category of item:");
        String category = sc.nextLine();
        Inventory item2 = new Inventory(item, quantity, price, expiration, category);
        System.out.println("\n--------------Details of Inventory-------------");
        item2.display();
    }
}
