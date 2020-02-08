import com.mycompany.app;
import java.util.Scanner;

class Setprice
{
	 void setprice()
	{}
}

class Sweets extends Setprice
{
	int sprice_per_gram;
	public int kalakhand()
	{
	sprice_per_gram=20;
	return sprice_per_gram;
	}
}

class Chocolates extends Setprice
{
	int cprice_per_gram;
	public int dairymilk()
	{
	cprice_per_gram=10;
	return cprice_per_gram;
	}
}

class Sweets_price 
{
	Sweets s=new Sweets();
	int price;
	int kprice;
	public int sprice(String sweets[],int weight)
	{
	for(int i=0;i<sweets.length;i++)
	{
	if(sweets[i]=="kalakhand")
	{
		kprice=s.kalakhand();
		//System.out.println(price);
	}
	}
	price=kprice*weight;
	return price;
	}
}

class Chocolates_price 
{
	Chocolates c=new Chocolates();
	int price;
	int kprice;
	public int cprice(String chocolates[],int weight)
	{
	for(int i=0;i<chocolates.length;i++)
	{
	if(chocolates[i]=="dairymilk")
	{
		kprice=c.dairymilk();
		price=weight*kprice;
		
		//System.out.println(price);
	}
	}
	return price;
	}
}	

 
class App
{
	public static void main(String a[])
	{	
	Scanner sc=new Scanner(System.in);
//arrays for sweets	
	String sweets_in_gift[]=new String[10];
	int weight_of_sweets[]=new int[10];
//arrays for chocolates
	String chocolates_in_gift[]=new String[10];
	int weight_of_chocolates[]=new int[10];

//input for sweeets

	System.out.println("Enter no.of sweets:");
	int no_of_sweets=sc.nextInt();
	
	System.out.println("Enter sweets:");
	for(int i=0;i<no_of_sweets;i++)
	{
	sweets_in_gift[i]=sc.next();
	}

	System.out.println("Enter weight:");
	for(int i=0;i<no_of_sweets;i++)
	{
	weight_of_sweets[i]=sc.nextInt();
	}

//input for chocolates

	System.out.println("Enter no.of chocolates:");
	int no_of_chocolates=sc.nextInt();
	
	System.out.println("Enter chocolates:");
	for(int i=0;i<no_of_chocolates;i++)
	{
	chocolates_in_gift[i]=sc.next();
	}

	System.out.println("Enter weight:");
	for(int i=0;i<no_of_chocolates;i++)
	{
	weight_of_chocolates[i]=sc.nextInt();
	}

//computing total weight of sweets

	int total_sweets=0;
	for(int i=0;i<no_of_sweets;i++)
	{
	total_sweets+=weight_of_sweets[i];
	}

//computing total weight of chocolates

	int total_chocolates=0;
	for(int i=0;i<no_of_chocolates;i++)
	{
	total_chocolates+=weight_of_chocolates[i];
	}

//printing total weight

	int total_weight= total_sweets+total_chocolates;
	System.out.println("Total weight of your gift is: "+total_weight);


//price of sweets

	Sweets_price sp=new Sweets_price();
	int price_sweets=sp.sprice(sweets_in_gift,total_sweets);
	//System.out.println(price_sweets);	

//price of chocolates

	Chocolates_price cp=new Chocolates_price();
	int price_chocolates=cp.cprice(chocolates_in_gift,total_chocolates);
	//System.out.println(price_chocolates);

//total price

	int tp=(price_sweets+price_chocolates);
	System.out.println("total gift price: "+tp);
	}
}