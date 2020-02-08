package gift;
import java.util.*;
interface Chocolates{
	void sort();
	int totalWeightOfChocolate();
}
public class Chocolate implements Chocolates {
	int price,weight;
	int numberOfChocolates;
	ArrayList<Chocolate> chocolateArray=new ArrayList<Chocolate>();
	 public Chocolate()
	{
		
	}
public Chocolate(int price,int weight)
{
	this.price=price;
	this.weight=weight;
}
public void getAttributesOfChocolate()
{
	int p,w;
	Scanner input=new Scanner(System.in);
	  
   
	System.out.println("enter number of chocolates");
	 numberOfChocolates=input.nextInt();
	
	for(int i=1;i<=numberOfChocolates;i++)
	{
		System.out.println("enter price of chocolate" +i);
		
		
		
		 p=input.nextInt();
		
		System.out.println("enter weight of chocolate " +i);
		 w=input.nextInt();
	
		
		Chocolate c=new Chocolate(p,w); 
		chocolateArray.add(c);
		input.close();
	}
}
public void sort()
{
	System.out.println("soting chocolates according to price");
	int[] price=new int[numberOfChocolates];
	for(int i=0;i<chocolateArray.size();i++)
	{
		price[i]=chocolateArray.get(i).price;
	}
	for(int i=0;i<price.length;i++)
	{
	     for(int j=i+1;j<price.length;j++)
	     {
	    	 if(price[i]>price[j])
	    	 {
	    		 int temp=price[i];
	    		 price[i]=price[j];
	    		 price[j]=temp;
	    				 
	    	 }
	     }
	}
		
				
	}

public	int totalWeightOfChocolate()
{
int totalweight=0;
for(int i=0;i<chocolateArray.size();i++)
{
	totalweight+=chocolateArray.get(i).weight;
}
return totalweight;
	
}
}
